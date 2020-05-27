package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.ImgData
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_user.view.*

class ImgViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val img = itemView.findViewById<ImageView>(R.id.img_grid_img)
    fun bind(Data: ImgData)
    {
        Glide.with(itemView).load(Data.img).into(img)
    }
}