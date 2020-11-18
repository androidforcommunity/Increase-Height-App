package com.therealsanjeev.increaseheight.starter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.therealsanjeev.increaseheight.R
import com.therealsanjeev.increaseheight.databinding.ActivityRawBinding

class RawActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_raw)

        //val nextButton: Button = findViewById(R.id.buttonFragment)

        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityRawBinding>(this, R.layout.activity_raw)
        binding.fragmentButton.setOnClickListener {
            val intent = Intent(this, NameFragment::class.java)
            startActivity(intent)
        }

        //return binding.root

    }
}