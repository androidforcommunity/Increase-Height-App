package com.therealsanjeev.increaseheight.starter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.therealsanjeev.increaseheight.R
import com.therealsanjeev.increaseheight.databinding.FragmentNameBinding

class NameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding:FragmentNameBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_name, container,false
        )
        binding.nextBtnName.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_nameFragment2_to_genderFragment)
        )

        // Inflate the layout for this fragment
        return binding.root
    }

}