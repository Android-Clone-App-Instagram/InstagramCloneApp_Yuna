package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.HomeData
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R

class HomeAdapter(private val context: Context) : RecyclerView.Adapter<HomeViewHolder>() {
    var datas = mutableListOf<HomeData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_rv_home,parent,false)
        return HomeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}