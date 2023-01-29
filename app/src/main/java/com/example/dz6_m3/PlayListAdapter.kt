package com.example.dz6_m3

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.dz6_m3.databinding.ItemMusicBinding

class PlayListAdapter(val playList:ArrayList<Music>,val onClick:(position :Int) -> Unit):RecyclerView.Adapter<PlayListAdapter.PlaylistViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
     return  PlaylistViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
       return  playList.size
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        holder.bind(playList[position])
    }

    inner class PlaylistViewHolder(private val binding: ItemMusicBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(playlist:Music) {

            itemView.setOnClickListener{
                onClick(adapterPosition)



            val item = playList[adapterPosition]
            binding.tvName.text = item.name
            binding.tvSong.text= item.name_music
            binding.tvNumber.text = item.number.toString()
            binding.tvTime.text= item.time.toString()



            }
        }
    }




}
