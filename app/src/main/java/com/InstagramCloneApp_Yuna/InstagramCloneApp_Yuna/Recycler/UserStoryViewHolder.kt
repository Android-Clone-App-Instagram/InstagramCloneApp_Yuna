package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.StoryData
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R.color.colorBlack
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_rv_story.view.*
import org.w3c.dom.Text

class UserStoryViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val img = itemView.findViewById<ImageView>(R.id.img_rv_story_user)
    val id = itemView.findViewById<TextView>(R.id.tv_rv_story_user)

    fun bind(Data: StoryData)
    {
        if(Data.id.equals("새로 만들기"))
        {
            id.text = Data.id
            img.setImageResource(R.drawable.ic_add_black_24dp)

        }
        else {
            Glide.with(itemView).load(Data.img).into(img)
            id.text = Data.id
        }
    }
}
