package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Fragment.*

class MainPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getCount(): Int =5

    override fun getItem(position: Int): Fragment {
        return when(position)
        {
            0-> HomeFragment()
            1-> SearchFragment()
            2-> PlusFragment()
            3->HeartFragment()
            else-> UserFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        val title = when(position)
        {
            0->"Grid"
            else->"With"
        }
        return title
    }
}