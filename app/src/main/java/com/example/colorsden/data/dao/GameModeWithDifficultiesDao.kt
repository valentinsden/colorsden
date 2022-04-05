package com.example.colorsden.data.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.colorsden.model.GameModeWithDifficulties
import kotlinx.coroutines.flow.Flow

@Dao
interface GameModeWithDifficultiesDao {

    @Transaction
    @Query("SELECT * FROM game_mode WHERE gmid = :gmid")
    fun getGameModeWithDifficulties(gmid: Int): Flow<GameModeWithDifficulties>

}