package com.ikemura.aac_sample.api

import com.ikemura.aac_sample.model.Repo
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * APIクライアント
 */
class ApiClient {
    private val apiService: GitHubService
    init {
        val okBuilder = OkHttpClient.Builder()
        // タイムアウト
        okBuilder.connectTimeout(5000L, TimeUnit.SECONDS)

        val retrofit = Retrofit.Builder()
                .client(okBuilder.build())
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        apiService = retrofit.create(GitHubService::class.java)
    }

    fun getListRepos(user:String): Call<List<Repo>> {
        return apiService.listRepos(user)
    }
}