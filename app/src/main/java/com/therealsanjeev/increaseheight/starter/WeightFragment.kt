package com.therealsanjeev.increaseheight.starter

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.therealsanjeev.increaseheight.R
import com.therealsanjeev.increaseheight.databinding.FragmentWeightBinding

class WeightFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val binding: FragmentWeightBinding = DataBindingUtil.inflate(
           inflater, R.layout.fragment_weight, container, false
       )

       binding.doneBtnName.setOnClickListener {
           Toast.makeText(context, "Let's go to MainActivity", Toast.LENGTH_SHORT).show()

       }

       return binding.root
    }

}