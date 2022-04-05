package com.example.colorsden.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import com.example.colorsden.data.dao.GameModeDao
import com.example.colorsden.data.dao.GameModeWithDifficultiesDao
import com.example.colorsden.model.GameMode


class ColorsDenViewModel(
    private val gameModeDao: GameModeDao
    //private val gameModeWithDifficultiesDao: GameModeWithDifficultiesDao
    ) : ViewModel() {

    fun allGameModes(): LiveData<List<GameMode>> = gameModeDao.getAllGameModes().asLiveData()
}

class ColorsDenViewModelFactory(private val gameModeDao: GameModeDao) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ColorsDenViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return ColorsDenViewModel(gameModeDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}