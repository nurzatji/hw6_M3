package com.example.dz6_m3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.example.dz6_m3.databinding.FragmentFirstBinding

class FirstFragment : Fragment(){

   private var secondFragment: SecondFragment = SecondFragment()
    private lateinit var binding: FragmentFirstBinding
    private val playlist = ArrayList<Music>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        val adapter = PlayListAdapter(playlist,this::onClick)
        binding.recyclerView.adapter = adapter


    }
    @SuppressLint("SuspiciousIndentation")
    private fun onClick(position:Int){
      val bundle = Bundle()
//        bundle.putString("key",playlist[position].name_music.toString())
        bundle.putSerializable("key",playlist[position])

        secondFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container,secondFragment).addToBackStack(null).commit()

    }

    private fun loadData() {
        playlist.add(Music("Blank Spase", "Taylor Swift", "1", "3:22"))
        playlist.add(Music("Watch", "Silento", "2", "2:11"))
        playlist.add(Music("Imagine Dragons", "Enemy", "3", "2:11"))
        playlist.add(Music("Stromae", "Papaoutai", "4", "5:11"))
        playlist.add(Music("Dua Lipa", "Love again", "5", "1:11"))
        playlist.add(Music("Dua Lipa", "Love again", "6", "1:11"))
        playlist.add(Music("Dua Lipa", "Love again", "7", "3:1"))
        playlist.add(Music("Dua Lipa", "Love again", "8", "2:11"))
        playlist.add(Music("Dua Lipa", "Love again", "9", "2:11"))
        playlist.add(Music("Dua Lipa", "Love again", "10", "2:11"))

    }

    }




