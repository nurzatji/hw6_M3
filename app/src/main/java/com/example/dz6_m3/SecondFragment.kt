package com.example.dz6_m3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dz6_m3.databinding.FragmentSecondBinding

class SecondFragment : Fragment(),java.io.Serializable {

private lateinit var binding: FragmentSecondBinding
private lateinit var musicList:Music




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

  musicList = arguments?.getSerializable("key") as Music
//        binding.tvSong.text= musicList.name
    binding.tvSong.text = musicList.name
        binding.tvName.text = musicList.name_music

    }

}