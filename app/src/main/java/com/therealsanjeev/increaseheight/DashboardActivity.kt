package com.therealsanjeev.increaseheight

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_workout_plan.*

class DashboardActivity : AppCompatActivity(R.layout.activity_dashboard) {

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navView: BottomNavigationView = findViewById(R.id.bottom_bar)

        val navController = findNavController(R.id.main_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        toolbarDashboard.setTitle(R.string.app_name)

//        val appBarConfiguration = AppBarConfiguration(setOf(
//            R.id.dashBoard_nav, R.id.nutritions_nav, R.id.reports_nav,R.id.me_nav))
//        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }

}