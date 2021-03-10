package com.therealsanjeev.increaseheight.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.therealsanjeev.increaseheight.R
import com.therealsanjeev.increaseheight.model.Days
import kotlinx.android.synthetic.main.day_card.view.*

class DayRecyclerAdapter(private var days: ArrayList<Days>, private val onClickItem: onItemClickListener) :
    RecyclerView.Adapter<DayRecyclerAdapter.ViewHolder>() {


    class ViewHolder(itemView: View, onClickItem: onItemClickListener) : RecyclerView.ViewHolder(itemView) {

        var dayTitle: TextView
        val dayImage : ImageView

        init {
            itemView.setOnClickListener {
                onClickItem.onClick(adapterPosition)
            }
            dayTitle = itemView.day_title
            dayImage = itemView.day_image
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.day_card, parent, false)
        return ViewHolder(view, onClickItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val day = days[position]
        holder.dayTitle.text = day.dayName
        holder.dayImage.setImageResource(day.dayImage)
    }

    override fun getItemCount(): Int {
        return days.size
    }

    interface onItemClickListener {
        fun onClick(position: Int)
    }

}