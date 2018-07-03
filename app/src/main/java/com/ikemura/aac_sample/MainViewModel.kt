package com.ikemura.aac_sample

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import com.ikemura.aac_sample.api.ApiClient
import com.ikemura.aac_sample.model.Repo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {
    private val repo = MutableLiveData<String>()

    /**
     * APIリクエスト開始
     */
    fun request() {
        val user = "octocat" //表示するgithubユーザー名
        // APIリクエスト開始
        ApiClient().getListRepos(user).enqueue(object : Callback<List<Repo>> {
            override fun onResponse(call: Call<List<Repo>>?, response: Response<List<Repo>>?) {
                Log.d(TAG,response?.body().toString())
                repo.value = response?.body().toString()
            }
            override fun onFailure(call: Call<List<Repo>>?, t: Throwable?) {
                Log.e(TAG,t.toString())
            }
        })
    }

    fun getRepo(): LiveData<String> {
        return repo
    }

    companion object {
        private val TAG = MainViewModel::class.java.simpleName
    }
}