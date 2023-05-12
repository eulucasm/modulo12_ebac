package com.omelhordobrasil.kotlinbr.tamojunto.lucao.fragmentsclass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.omelhordobrasil.kotlinbr.tamojunto.lucao.fragmentsclass.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    val args: SecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentSecondBinding.inflate(layoutInflater,container, false)

        binding.textView.text = args.name
        binding.textView2.text = "Parabens Voce completou ${args.age.toString()} anos de idade "

        return binding.root
    }

}