package com.example.colorsden.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.colorsden.model.GameMode
import kotlinx.coroutines.flow.Flow

@Dao
interface GameModeDao {

    @Query("SELECT * FROM game_mode")
    fun getAllGameModes(): Flow<List<GameMode>>

}