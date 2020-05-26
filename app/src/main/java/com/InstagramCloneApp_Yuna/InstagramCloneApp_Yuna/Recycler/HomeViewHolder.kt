package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.HomeData
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.StoryData
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R
import com.bumptech.glide.Glide

class HomeViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val userImg = itemView.findViewById<ImageView>(R.id.img_user_rv_home)
    val userId = itemView.findViewById<TextView>(R.id.tv_user_rv_home)
    val contentId = itemView.findViewById<TextView>(R.id.tv_id_rv_home)
    val contentImg = itemView.findViewById<ImageView>(R.id.img_content_rv_home)
    val content1 = itemView.findViewById<TextView>(R.id.tv_content1_rv_home)
    val content2 = itemView.findViewById<TextView>(R.id.tv_content2_rv_home)
    val like = itemView.findViewById<TextView>(R.id.tv_like_rv_home)

    fun bind(Data: HomeData)
    {
        Glide.with(itemView).load(Data.userImg).into(userImg)
        userId.text= Data.userID
        contentId.text = Data.userID
        like.text = Data.like.toString()
        Glide.with(itemView).load(Data.contentImg).into(contentImg)
       // content1.text = Data.content.slice(0..7)
       // content2.text = Data.content.slice(8..30)



    }
}