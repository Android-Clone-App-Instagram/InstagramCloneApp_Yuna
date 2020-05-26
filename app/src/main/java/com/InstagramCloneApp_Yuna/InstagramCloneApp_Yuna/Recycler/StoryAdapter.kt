package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.StoryData
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R

class StoryAdapter(private val context: Context) : RecyclerView.Adapter<StoryViewHolder>() {
    var datas = mutableListOf<StoryData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_rv_story,parent,false)
        return StoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}