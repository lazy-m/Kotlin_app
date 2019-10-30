package com.lazy.kotlin_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lazy.kotlin_app.databinding.RecyclerViewItemBinding

class SimpleAdapter(val userList:List<User>): RecyclerView.Adapter<SimpleAdapter.TestViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= TestViewHolder(
        RecyclerViewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun getItemCount():Int =userList.size
    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    class TestViewHolder(val  binding:RecyclerViewItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(data:User){
            binding.user=data
            binding.executePendingBindings()
        }
    }

}

