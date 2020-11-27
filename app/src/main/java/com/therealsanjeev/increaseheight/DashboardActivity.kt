package com.therealsanjeev.increaseheight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Toast

import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.ui.setupActionBarWithNavController

import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.dashboard.*
import java.lang.RuntimeException
import androidx.navigation.ui.AppBarConfiguration as AppBarConfiguration1

class DashboardActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
        setUpToolBar()


//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)


        val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce)
        val relativeLayoutBounce = findViewById<RelativeLayout>(R.id.item1)
        relativeLayoutBounce.setOnClickListener {

            relativeLayoutBounce.startAnimation(bounceAnimation)
        }

        val nutritionPlan = findViewById<LinearLayout>(R.id.item7)
        nutritionPlan.setOnClickListener {
            nutritionPlan.startAnimation(bounceAnimation)

            try{
                startActivity(Intent(applicationContext, NutritionActivity::class.java))
            }catch (e: RuntimeException){
                Toast.makeText(applicationContext, e.message, Toast.LENGTH_SHORT).show()
            }


        }

    }

    private fun setUpToolBar() {
        setSupportActionBar(toolBar as Toolbar?)
        val actionbar = supportActionBar
        actionbar?.title = "Increase Height!!!"

        toggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolBar as Toolbar?,
            R.string.open,
            R.string.close
        )
        toggle.isDrawerIndicatorEnabled = true
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.side_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item))
            return true
        when (item.itemId) {

            R.id.side_noti_notification -> Toast.makeText(
                applicationContext,
                "Notification", Toast.LENGTH_SHORT
            ).show()
            R.id.side_noti_setting -> Toast.makeText(
                applicationContext,
                "Setting", Toast.LENGTH_SHORT
            ).show()
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {

        super.onBackPressed()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.nav_nutrition -> {
                val intent = Intent(this, NutritionActivity::class.java)
                startActivity(intent)
            }
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}