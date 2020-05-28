package com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.InstagramCloneApp_Yuna.InstagramCloneApp_Yuna.Fragment.*

class UserGridAdpater(fm: FragmentManager) : FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getCount(): Int =2

    override fun getItem(position: Int): Fragment {
        return when(position)
        {
            0-> GridFragment()
            else-> WithFragment()
        }
    }
}