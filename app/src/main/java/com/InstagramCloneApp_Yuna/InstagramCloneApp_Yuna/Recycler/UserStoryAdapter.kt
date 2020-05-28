package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.StoryData
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R

class UserStoryAdapter(private val context: Context) : RecyclerView.Adapter<UserStoryViewHolder>() {
    var datas = mutableListOf<StoryData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserStoryViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_rv_story_user,parent,false)
        return UserStoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: UserStoryViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}