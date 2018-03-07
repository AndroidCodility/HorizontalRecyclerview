package com.codility.recyclerpicasso

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.codility.horizontalrecyclerview.R
import com.codility.horizontalrecyclerview.model.Version

/**
 * Created by Govind on 3/7/2018.
 */
class MyAdapter(private val versionList: ArrayList<Version>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(versionList[position])
    }

    override fun getItemCount(): Int {
        return versionList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(version: Version) {
            val textView = itemView.findViewById<TextView>(R.id.tvName)
            val imageView = itemView.findViewById<ImageView>(R.id.imageView)
            textView.text = version.name

            Glide.with(itemView.context).load(version.url).into(imageView)
        }
    }
}