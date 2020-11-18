package com.therealsanjeev.increaseheight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class NutritionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition)

       setSupportActionBar(findViewById(R.id.awesome_toolbar))
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}