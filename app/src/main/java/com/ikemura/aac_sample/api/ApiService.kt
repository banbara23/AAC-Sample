package com.ikemura.aac_sample.api

import com.ikemura.aac_sample.model.Repo
import kotlinx.coroutines.experimental.Deferred
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * APIサービス
 */
interface GitHubService {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String): Deferred<List<Repo>>
}
