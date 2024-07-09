package com.example.myapplication2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val name: TextView = itemView.findViewById(R.id.tv_name)
    private val type: TextView = itemView.findViewById(R.id.tv_type)
    private val color: TextView = itemView.findViewById(R.id.tv_color)
    private val avatar: ImageView = itemView.findViewById(R.id.img_animal)

    fun bind(animal: Animal) {
        name.text = animal.name
        type.text = animal.type
        color.text = animal.color
        avatar.setImageResource(animal.avatar)
    }
}