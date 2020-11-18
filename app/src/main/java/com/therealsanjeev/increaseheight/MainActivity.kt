package com.therealsanjeev.increaseheight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.therealsanjeev.increaseheight.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        //Initializing the NavController
        val navController = this.findNavController(R.id.mNavHostFragment)

        //Link the NavController to our ActionBar


        //NavigationUI.setupWithNavController(navController)
    }
}