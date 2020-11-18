package com.therealsanjeev.increaseheight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import com.therealsanjeev.increaseheight.starter.RawActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


       

        val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce)
        val relativeLayoutBounce = findViewById<RelativeLayout>(R.id.item1)
        relativeLayoutBounce.setOnClickListener {
            relativeLayoutBounce.startAnimation(bounceAnimation)
        }

        val nutritionLayout = findViewById<LinearLayout>(R.id.item7)
        nutritionLayout.setOnClickListener {
            nutritionLayout.startAnimation(bounceAnimation)
            val intent = Intent(this, RawActivity::class.java)
            startActivity(intent)



        }

    }
}