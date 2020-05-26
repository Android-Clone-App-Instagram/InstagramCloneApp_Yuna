package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.StoryData
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_rv_story.view.*
import org.w3c.dom.Text

class StoryViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val img = itemView.findViewById<ImageView>(R.id.img_rv_story)
    val id = itemView.findViewById<TextView>(R.id.tv_rv_story)

    fun bind(Data: StoryData)
    {

        Glide.with(itemView).load(Data.img).into(img)
        id.text = Data.id

    }
}
