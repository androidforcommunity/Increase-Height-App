package com.therealsanjeev.increaseheight.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.therealsanjeev.increaseheight.R
import com.therealsanjeev.increaseheight.adapter.WorkoutRecyclerAdapter
import com.therealsanjeev.increaseheight.model.Workout
import kotlinx.android.synthetic.main.activity_day_workout.*

class DayActivity : AppCompatActivity(), WorkoutRecyclerAdapter.onItemClickListener  {

    var workoutList = ArrayList<Workout>()
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day_workout)

        val data = intent.getStringExtra("key")
        val toolbar = material_toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.title = data
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        Log.d("NEW_TAG", "Getting data as $data")

        workoutList = arrayListOf<Workout>(
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
            Workout("Diamond Pushup", 18, R.drawable.pushups),
        )

        val recylerAdapter = WorkoutRecyclerAdapter(workoutList, this)
        layoutManager = LinearLayoutManager(this)
        workout_recycler_view.adapter = recylerAdapter
        workout_recycler_view.layoutManager = layoutManager

        start_btn.setOnClickListener {
            Toast.makeText(this, "Clicked on the", Toast.LENGTH_SHORT).show()
//            val intent = Intent(applicationContext, WorkoutTimerActivity::class.java)
//            startActivity(intent)
        }
    }

    override fun onClick(position: Int) {
        Toast.makeText(this, "Clicked on the $position", Toast.LENGTH_SHORT).show()
        val workoutname = workoutList[position].workoutName
        val workoutimage = workoutList[position].workoutImage
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home)
            onBackPressed()
        return super.onOptionsItemSelected(item)
    }
}