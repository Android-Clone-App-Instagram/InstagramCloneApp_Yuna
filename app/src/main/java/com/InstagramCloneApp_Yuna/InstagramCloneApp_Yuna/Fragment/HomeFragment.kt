package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.HomeData
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Data.StoryData

import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.R
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler.HomeAdapter
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Recycler.StoryAdapter
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.util.HorizontalItemDecorator
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.util.VerticalItemDecorator
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    lateinit var homeAdpater : HomeAdapter
    lateinit var storyAdapter : StoryAdapter
    val homedatas = mutableListOf<HomeData>()
    val storydatas = mutableListOf<StoryData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        homeAdpater  = HomeAdapter(view!!.context)
        rv_home.adapter = homeAdpater
        //home_recycler_view.addItemDecoration(HorizontalItemDecorator(24))
       // rv_home.addItemDecoration(VerticalItemDecorator(28))
        storyAdapter = StoryAdapter(view!!.context)
        rv_story.adapter = storyAdapter
        rv_story.addItemDecoration(HorizontalItemDecorator(16))

        loadDatas()


    }
    fun loadDatas()
    {
        homedatas.apply {
            add(HomeData(userImg ="https://s3.ap-northeast-2.amazonaws.com/elasticbeanstalk-ap-northeast-2-176213403491/media/magazine_img/magazine_262/%EC%8D%B8%EB%84%A4%EC%9D%BC.jpg", userID = "yunakim1",content = "인스타그램 클론앱 뷰짜기 연습중이예요",
                contentImg = "https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg",like = 1000))

            add(HomeData(userImg ="https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg", userID = "yunakim2",content = "인스타그램 클론앱 뷰짜기 연습중이예요",
                contentImg = "https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg",like = 1000))

            add(HomeData(userImg ="https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg", userID = "yunakim3",content = "인스타그램 클론앱 뷰짜기 연습중이예요",
                contentImg = "https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg",like = 1000))

            add(HomeData(userImg ="https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg", userID = "yunakim4",content = "인스타그램 클론앱 뷰짜기 연습중이예요",
                contentImg = "https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg",like = 1000))

            add(HomeData(userImg ="https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg", userID = "yunakim5",content = "인스타그램 클론앱 뷰짜기 연습중이예요",
                contentImg = "https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg",like = 1000))

            add(HomeData(userImg ="https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg", userID = "yunakim6",content = "인스타그램 클론앱 뷰짜기 연습중이예요",
                contentImg = "https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg",like = 1000))

            add(HomeData(userImg ="https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg", userID = "yunakim7",content = "인스타그램 클론앱 뷰짜기 연습중이예요",
                contentImg = "https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg",like = 1000))

            add(HomeData(userImg ="https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg", userID = "yunakim8",content = "인스타그램 클론앱 뷰짜기 연습중이예요",
                contentImg = "https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg",like = 1000))

            add(HomeData(userImg ="https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg", userID = "yunakim9",content = "인스타그램 클론앱 뷰짜기 연습중이예요",
                contentImg = "https://image.dongascience.com/Photo/2018/12/2d5efe44bdd02f3e2ec4e99189d89d18.jpg",like = 1000))
        }

        storydatas.apply {
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim1"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim2"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim3"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim4"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim5"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim6"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim7"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim8"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim9"))
            add(StoryData(img = "https://t1.daumcdn.net/liveboard/holapet/0e5f90af436e4c218343073164a5f657.JPG",id = "yunakim10"))

        }

        homeAdpater.datas = homedatas
        storyAdapter.datas = storydatas
        homeAdpater.notifyDataSetChanged()
        storyAdapter.notifyDataSetChanged()


    }

}
