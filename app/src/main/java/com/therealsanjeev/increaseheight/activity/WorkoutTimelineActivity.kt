package com.therealsanjeev.increaseheight.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.therealsanjeev.increaseheight.R
import com.therealsanjeev.increaseheight.adapter.DayRecyclerAdapter
import com.therealsanjeev.increaseheight.model.Days
import kotlinx.android.synthetic.main.activity_workout_timeline.*

class WorkoutTimelineActivity : AppCompatActivity(), DayRecyclerAdapter.onItemClickListener {

    var dayList = ArrayList<Days>()
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_timeline)

        dayList = arrayListOf<Days>(
            Days("Day 1", R.drawable.ic_man_lift),
            Days("Day 2", R.drawable.ic_man_lift),
            Days("Day 3", R.drawable.ic_man_lift),
            Days("Rest Day", R.drawable.ic_man_lift),
            Days("Day 5", R.drawable.ic_man_lift),
            Days("Day 6", R.drawable.ic_man_lift),
            Days("Day 7", R.drawable.ic_man_lift),
            Days("Day 8", R.drawable.ic_man_lift),
            Days("Rest Day", R.drawable.ic_man_lift),
            Days("Day 10", R.drawable.ic_man_lift),
            Days("Day 11", R.drawable.ic_man_lift),
            Days("Day 12", R.drawable.ic_man_lift),
            Days("Day 13", R.drawable.ic_man_lift),
            Days("Day 14", R.drawable.ic_man_lift),
            Days("Rest Day", R.drawable.ic_man_lift),
            Days("Day 16", R.drawable.ic_man_lift),
            Days("Day 17", R.drawable.ic_man_lift),
            Days("Day 18", R.drawable.ic_man_lift)
        )

        val recyclerAdapter = DayRecyclerAdapter(dayList, this)
        layoutManager = GridLayoutManager(this, 3)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = recyclerAdapter
    }

    override fun onClick(position: Int) {
        val dayTitle = dayList[position].dayName
        //Toast.makeText(this, "Clicked on the $dayTitle", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, DayActivity::class.java)
        intent.putExtra("key", dayTitle)
        startActivity(intent)
    }
}