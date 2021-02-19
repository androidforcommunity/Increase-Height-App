package com.therealsanjeev.increaseheight.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.therealsanjeev.increaseheight.R
import kotlinx.android.synthetic.main.dashboard.*
import kotlinx.android.synthetic.main.dashboard.view.*
import nl.joery.animatedbottombar.AnimatedBottomBar

class DashBoard : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_dashboard, container, false)

        return view
    }

}