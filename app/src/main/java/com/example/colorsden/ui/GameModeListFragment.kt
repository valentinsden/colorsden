package com.example.colorsden.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.colorsden.ColorsDenApplication
import com.example.colorsden.databinding.FragmentGameModeListBinding
import com.example.colorsden.ui.viewmodel.ColorsDenViewModel
import com.example.colorsden.ui.viewmodel.ColorsDenViewModelFactory

/**
 * A fragment to view the list of [GameMode]s stored in the database.
 * Clicking on a [GameModeActionButton] list item launches the [DifficultyListFragment].
 */
class GameModeListFragment : Fragment() {

    private val viewModel: ColorsDenViewModel by activityViewModels() {
        ColorsDenViewModelFactory(
            (activity?.application as ColorsDenApplication).database.gameModeDao()
        )
    }

    private var _binding: FragmentGameModeListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentGameModeListBinding.inflate(inflater, container, false)
        return binding.root
    }

}