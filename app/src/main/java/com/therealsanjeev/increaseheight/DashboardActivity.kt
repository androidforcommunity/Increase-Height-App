package com.therealsanjeev.increaseheight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Toast

import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.ui.setupActionBarWithNavController

import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.dashboard.*
import androidx.navigation.ui.AppBarConfiguration as AppBarConfiguration1

class DashboardActivity : AppCompatActivity() {
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

//        val toolbar: Toolbar = findViewById(R.id.toolBar)
        setSupportActionBar(toolBar)
//
//        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
//        val navView: NavigationView = findViewById(R.id.nav_view)


//        appBarConfiguration= AppBarConfiguration1(setOf(
//            R.id.nav_home,R.id.nav_notifications
//        ),drawerLayout)
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)

        toggle= ActionBarDrawerToggle(this,drawer_layout,R.string.open,R.string.close)
//        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
//       nav_view
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        nav_view.setNavigationItemSelectedListener (this)

//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)



        val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce)
        val relativeLayoutBounce = findViewById<RelativeLayout>(R.id.item1)
        relativeLayoutBounce.setOnClickListener {

            relativeLayoutBounce.startAnimation(bounceAnimation)
        }

        val nutritionPlan = findViewById<LinearLayout>(R.id.item7)
        nutritionPlan.setOnClickListener {
            nutritionPlan.startAnimation(bounceAnimation)
            try {
                val intent = Intent(this, NutritionActivity::class.java)
                startActivity(intent)
            } catch (e : NullPointerException){
                Toast.makeText(this, "Error " + e.message, Toast.LENGTH_SHORT).show()
            }

        }

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.side_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item))
            return true
        when(item.itemId){

            R.id.nav_home -> Toast.makeText(applicationContext,
                "Nav Home",Toast.LENGTH_SHORT).show()
            R.id.nav_aboutUs ->Toast.makeText(applicationContext,
                "Nav about",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }


}