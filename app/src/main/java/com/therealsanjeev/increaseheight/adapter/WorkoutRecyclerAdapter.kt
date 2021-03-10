package com.therealsanjeev.increaseheight.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.therealsanjeev.increaseheight.R
import com.therealsanjeev.increaseheight.model.Workout
import kotlinx.android.synthetic.main.workout_single_item.view.*

class WorkoutRecyclerAdapter(private var workout: ArrayList<Workout>, private val onClickItem: onItemClickListener) :
    RecyclerView.Adapter<WorkoutRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View, onClickItem: onItemClickListener) : RecyclerView.ViewHolder(itemView) {
        var workoutName: TextView
        var workoutCount: TextView
        var workoutImage: ImageView

        init {
            itemView.setOnClickListener {
                onClickItem.onClick(adapterPosition)
            }
            workoutName = itemView.workout_name
            workoutCount = itemView.workout_count
            workoutImage = itemView.workout_image
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.workout_single_item, parent, false)
        return ViewHolder(view, onClickItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val workout = workout[position]
        holder.workoutName.text = workout.workoutName
        holder.workoutCount.text = "x${workout.workoutCount}"
        holder.workoutImage.setImageResource(workout.workoutImage)
    }

    override fun getItemCount(): Int {
        return workout.size
    }

    interface onItemClickListener {
        fun onClick(position: Int)
    }

}