package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.ImgData

import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler.ImgAdapter
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_user.*

/**
 * A simple [Fragment] subclass.
 */
class UserFragment : Fragment() {

    lateinit var imgAdpater : ImgAdapter
   // lateinit var withAdpater : ImgAdapter
    val imgdatas = mutableListOf<ImgData>()
   // val withdatas = mutableListOf<ImgData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)



        Glide.with(view!!.context).load( "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG").into(img_user)

            imgAdpater  = ImgAdapter(view!!.context)
            rv_grid.adapter = imgAdpater
            rv_grid.layoutManager = GridLayoutManager(view!!.context,3,RecyclerView.VERTICAL,false)

            imgdatas.apply {
                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")


            }
            imgAdpater.datas = imgdatas
            imgAdpater.notifyDataSetChanged()
            tv_post.text = imgdatas.size.toString()



//            withAdpater = ImgAdapter(view!!.context)
//            rv_with.adapter = withAdpater
//            rv_with.layoutManager = GridLayoutManager(view!!.context,3,RecyclerView.VERTICAL,false)
//
//            withdatas.apply {
//                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
//                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
//                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
//                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
//                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
//                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
//                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
//                ImgData(img="https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG")
//            }
//
//
//            withAdpater.datas = withdatas
//
//            withAdpater.notifyDataSetChanged()


        }


    }



