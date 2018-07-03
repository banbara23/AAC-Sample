package com.ikemura.aac_sample

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import com.ikemura.aac_sample.api.ApiClient
import kotlinx.coroutines.experimental.launch

class MainViewModel : ViewModel() {
    private val repo = MutableLiveData<String>()

    /**
     * APIリクエスト開始
     */
    fun request() {
        val user = "octocat" //表示するgithubユーザー名
        // コルーチン開始
        launch {
            val repos = ApiClient().getListRepos(user).await()
            Log.d(TAG, repos.toString())
            // postValueにしないと IllegalStateException: Cannot invoke setValue on a background thread
            repo.postValue(repos.toString())
        }
    }

    fun getRepo(): LiveData<String> {
        return repo
    }

    companion object {
        private val TAG = MainViewModel::class.java.simpleName
    }
}