package com.example.waterfall

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.tag_item.view.*

class TagAdapter : RecyclerView.Adapter<TagAdapter.CustomHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tag_item, parent, false)
        return CustomHolder(view)
    }

    override fun getItemCount(): Int = data.tagList.count()

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {

        val colors = holder.itemView.context.resources.getStringArray(R.array.colors)
        val bgColorDrable = ContextCompat.getDrawable(holder.itemView.context, R.drawable.btn_tag)
        bgColorDrable?.let {
            it.setTint(Color.parseColor(colors[position]))
            holder.title.background = it } ?: kotlin.run { holder.title.setBackgroundColor(R.drawable.btn_tag) }

        holder.bind(data.tagList[position])


    }


    inner class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title = itemView.btn_tag


        fun bind(content: Content.Tag) {

            title.text = content.title

        }

    }

}