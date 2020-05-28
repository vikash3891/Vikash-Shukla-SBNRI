package com.example.vikashshuklasbnri.view.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vikashshuklasbnri.databinding.ViewRepoListItemBinding
import com.example.vikashshuklasbnri.model.Item
import com.example.vikashshuklasbnri.view.adapter.viewHolders.RepoListViewHolder
import com.example.vikashshuklasbnri.view.ui.repolist.RepoListViewModel

class RepoListAdapter(private val repoListViewModel: RepoListViewModel) : RecyclerView.Adapter<RepoListViewHolder>() {
    var repoList: List<Item> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val dataBinding = ViewRepoListItemBinding.inflate(inflater, parent, false)
        return RepoListViewHolder(dataBinding, repoListViewModel)
    }

    override fun getItemCount() = repoList.size

    override fun onBindViewHolder(holder: RepoListViewHolder, position: Int) {
        Log.e("RepoList Size: ", repoList.size.toString())
        holder.setup(repoList[position])
    }

    fun updateRepoList(repoList: List<Item>) {
        this.repoList = repoList
        notifyDataSetChanged()
    }
}