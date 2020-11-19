package com.therealsanjeev.increaseheight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.therealsanjeev.increaseheight.starter.RawActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)



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
}