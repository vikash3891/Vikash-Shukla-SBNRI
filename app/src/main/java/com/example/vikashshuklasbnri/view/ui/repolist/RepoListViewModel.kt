package com.example.vikashshuklasbnri.view.ui.repolist

import androidx.lifecycle.MutableLiveData
import com.example.vikashshuklasbnri.model.Item
import com.example.vikashshuklasbnri.model.RepoRepository
import com.example.vikashshuklasbnri.view.base.BaseViewModel

class RepoListViewModel : BaseViewModel() {
    val repoListLive = MutableLiveData<List<Item>>()

    fun fetchRepoList() {
        dataLoading.value = true
        RepoRepository.getInstance().getRepoList { isSuccess, response ->
            dataLoading.value = false
            if (isSuccess) {
                repoListLive.value = response
                empty.value = false
            } else {
                empty.value = true
            }
        }
    }
}