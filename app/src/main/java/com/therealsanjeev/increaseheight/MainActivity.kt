package com.therealsanjeev.increaseheight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.therealsanjeev.increaseheight.databinding.ActivityMainBinding
import com.therealsanjeev.increaseheight.starter.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.dashboardActivity.setOnClickListener {
            val dashboardActivityIntent = Intent(this, DashboardActivity::class.java)
            startActivity(dashboardActivityIntent)
        }




    }
}