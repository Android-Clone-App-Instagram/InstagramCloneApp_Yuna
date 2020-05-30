package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Fragment

import android.app.ActionBar
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Adapter.UserGridAdpater
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.ImgData
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.StoryData

import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R.drawable.selected_btn_user
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler.ImgAdapter
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler.StoryAdapter
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler.UserStoryAdapter
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_grid.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_user.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class UserFragment : Fragment() {


    lateinit var storyAdapter: UserStoryAdapter
    val storyData = mutableListOf<StoryData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val tablist = arrayOf(R.drawable.grid, R.drawable.user)
        Glide.with(view!!.context).load( "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG").into(img_user)

        storyAdapter = UserStoryAdapter(view!!.context)
        storyData.apply {
            add(StoryData(img= "https://w7.pngwing.com/pngs/587/356/png-transparent-computer-icons-plus-and-minus-signs-addition-cdr-cross-arrow.png",id="새로 만들기"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim1"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim2"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim3"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim4"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim5"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim6"))
        }
        storyAdapter.datas = storyData
        storyAdapter.notifyDataSetChanged()
        rv_story_user.adapter = storyAdapter



        val pagerAdapter = fragmentManager?.let { UserGridAdpater(it) }
        val pager = view!!.findViewById<ViewPager>(R.id.viewpager)
        pager.adapter = pagerAdapter
        val tab = view!!.findViewById<TabLayout>(R.id.tab)
        tab.setupWithViewPager(pager)

        tv_post.text = GridFragment().imgdatas.size.toString()



        val bottomSheet: BottomSheetBehavior<View> = BottomSheetBehavior.from(bottom_sheet_view)
        bottomSheet.state = BottomSheetBehavior.STATE_HIDDEN
        bottomSheet.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback(){
            override fun onSlide(bottomSheet: View, slideOffset: Float) {

            }
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when(newState){
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                        bottom_sheet_blur.visibility = View.VISIBLE
                        bottom_sheet_view.visibility = View.VISIBLE
                    }
                    BottomSheetBehavior.STATE_HIDDEN -> {
                        bottom_sheet_blur.visibility = View.INVISIBLE
                        bottom_sheet_view.visibility = View.INVISIBLE
                    }
                }
            }
        })



          //  bottomSheet.state = BottomSheetBehavior.STATE_COLLAPSED





        bottom_sheet_blur.setOnClickListener{
            bottomSheet.state = BottomSheetBehavior.STATE_HIDDEN
        }

        tab.getTabAt(0)?.setIcon(tablist.get(0))
        tab.getTabAt(1)?.setIcon(tablist.get(1))




        }



    }





