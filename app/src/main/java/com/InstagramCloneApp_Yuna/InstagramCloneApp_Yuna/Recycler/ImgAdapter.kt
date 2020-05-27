package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.HomeData
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.ImgData
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R

class ImgAdapter(private val context: Context) : RecyclerView.Adapter<ImgViewHolder>() {
    var datas = mutableListOf<ImgData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImgViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_grid,parent,false)
        return ImgViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: ImgViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}