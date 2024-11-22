package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter(private val musicList : ArrayList<Music>) :

    RecyclerView.Adapter<Adapter.MyViewHolder>() {
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val cover : ShapeableImageView = itemView.findViewById(R.id.cover)
        val songName : TextView = itemView.findViewById(R.id.songName)
        val singer : TextView = itemView.findViewById(R.id.singer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val curItem = musicList[position]
        holder.cover.setImageResource(curItem.cover)
        holder.songName.text = curItem.songName
        holder.singer.text = curItem.singer
    }

}