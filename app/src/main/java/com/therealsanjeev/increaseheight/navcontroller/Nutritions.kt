package com.therealsanjeev.increaseheight.navcontroller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.therealsanjeev.increaseheight.R


class Nutritions : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_nutritions, container, false)
        val toolbar = requireActivity().findViewById<View>(R.id.toolbarDashboard) as androidx.appcompat.widget.Toolbar
        toolbar.setTitle("Nutritions")
        return view
    }

}