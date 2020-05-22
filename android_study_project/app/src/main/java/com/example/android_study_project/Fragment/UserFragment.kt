package com.example.android_study_project.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toolbar

import com.example.android_study_project.R
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class UserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initLayout()
    }
    fun initLayout()
    {

        val toolbar = view?.findViewById<Toolbar>(R.id.toolbar)

    }

}
