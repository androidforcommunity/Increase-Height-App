package com.therealsanjeev.increaseheight.navcontroller

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.therealsanjeev.increaseheight.NutritionActivity
import com.therealsanjeev.increaseheight.R
import com.therealsanjeev.increaseheight.WorkoutPlanActivity
import kotlinx.android.synthetic.main.fragment_dashboard.view.*
import kotlinx.android.synthetic.main.item1_layout.view.*
import kotlinx.android.synthetic.main.item2_layout.*
import kotlinx.android.synthetic.main.item2_layout.view.*

class DashBoard : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val toolbar = requireActivity().findViewById<View>(R.id.toolbarDashboard) as androidx.appcompat.widget.Toolbar
        toolbar.setTitle(R.string.app_name)
        val view=inflater.inflate(R.layout.fragment_dashboard, container, false)

        view.above_18_list.setOnClickListener {
            val intent = Intent (getActivity(), WorkoutPlanActivity::class.java)
            getActivity()?.startActivity(intent)
        }
        view.below_18_list.setOnClickListener {
            val intent = Intent (getActivity(), WorkoutPlanActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        view.nutrition_items.setOnClickListener {
            val intent = Intent (getActivity(), NutritionActivity::class.java)
            getActivity()?.startActivity(intent)
        }
        return view
    }

}