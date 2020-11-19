package com.therealsanjeev.increaseheight

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_nutrition.*

class NutritionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition)
        customActionBar()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


    fun customActionBar() {
        setSupportActionBar(findViewById(R.id.awesome_toolbar))
        awesome_toolbar.setTitleTextColor(Color.WHITE)

        if (supportActionBar != null) {
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.setDisplayShowHomeEnabled(true)
            supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_back)
        }

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setTitle(resources.getText(R.string.nutrition_chart))
    }

}