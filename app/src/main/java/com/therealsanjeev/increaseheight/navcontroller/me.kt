package com.therealsanjeev.increaseheight.navcontroller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import com.therealsanjeev.increaseheight.R
import kotlinx.android.synthetic.main.activity_dashboard.view.*


class me : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_me, container, false)

        val toolbar = requireActivity().findViewById<View>(R.id.toolbarDashboard) as androidx.appcompat.widget.Toolbar
        toolbar.setTitle("Me")
        return view
    }

}