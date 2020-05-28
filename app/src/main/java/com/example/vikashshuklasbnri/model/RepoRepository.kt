package com.example.vikashshuklasbnri.model

import com.example.vikashshuklasbnri.model.api.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepoRepository {

    // GET repo list
    fun getRepoList(onResult: (isSuccess: Boolean, response: ArrayList<Item>?) -> Unit) {

        ApiClient.instance.getRepo("1","10").enqueue(object : Callback<ArrayList<Item>> {
            override fun onResponse(call: Call<ArrayList<Item>>?, response: Response<ArrayList<Item>>?) {
                if (response != null && response.isSuccessful)
                    onResult(true, response.body()!!)
                else
                    onResult(false, null)
            }

            override fun onFailure(call: Call<ArrayList<Item>>?, t: Throwable?) {
                onResult(false, null)
            }

        })
    }

    companion object {
        private var INSTANCE: RepoRepository? = null
        fun getInstance() = INSTANCE
                ?: RepoRepository().also {
                    INSTANCE = it
                }
    }
}