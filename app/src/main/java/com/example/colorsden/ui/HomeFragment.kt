package com.example.colorsden.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.colorsden.ColorsDenApplication
import com.example.colorsden.databinding.FragmentHomeBinding
import com.example.colorsden.ui.viewmodel.ColorsDenViewModel
import com.example.colorsden.ui.viewmodel.ColorsDenViewModelFactory

class HomeFragment : Fragment() {

    private val viewModel: ColorsDenViewModel by activityViewModels() {
        ColorsDenViewModelFactory(
            (activity?.application as ColorsDenApplication).database.gameModeDao()
        )
    }

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

}