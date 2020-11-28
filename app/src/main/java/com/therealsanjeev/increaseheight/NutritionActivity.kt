package com.therealsanjeev.increaseheight

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import androidx.room.Room
import com.therealsanjeev.increaseheight.database.AppDatabase
import com.therealsanjeev.increaseheight.databinding.ActivityRawBinding
import kotlinx.android.synthetic.main.activity_nutrition.*

class NutritionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition)
        customActionBar()
//
//        @Suppress("UNUSED_VARIABLE")
//        val binding = DataBindingUtil.setContentView<ActivityRawBinding>(this, R.layout.activity_nutrition)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "Nutrition List"
        ).build()

        //Log.i("LocalDatabase", "Database $db status")


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


    private fun customActionBar() {
        setSupportActionBar(findViewById(R.id.awesome_toolbar))
        awesome_toolbar.setTitleTextColor(Color.WHITE)

        if (supportActionBar != null) {
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.setDisplayShowHomeEnabled(true)
            supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_back)
        }

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        title = resources.getText(R.string.nutrition_chart)
    }

}