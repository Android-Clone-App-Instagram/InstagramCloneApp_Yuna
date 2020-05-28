package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.ImgData

import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler.ImgAdapter
import kotlinx.android.synthetic.main.fragment_with.*

/**
 * A simple [Fragment] subclass.
 */
class WithFragment : Fragment() {

   lateinit var withAdpater : ImgAdapter
    val withdatas = mutableListOf<ImgData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_with, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        withAdpater = ImgAdapter(view!!.context)
        rv_with.adapter = withAdpater
        rv_with.layoutManager = GridLayoutManager(view!!.context,3, RecyclerView.VERTICAL,false)

        withdatas.apply {
            add(ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG"))
            add(ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG"))
            add(ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG"))
            add(ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG"))
            add(ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG"))
            add(ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG"))
            add(ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG"))
            add(ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG"))

        }


        withAdpater.datas = withdatas

        withAdpater.notifyDataSetChanged()
    }
}
