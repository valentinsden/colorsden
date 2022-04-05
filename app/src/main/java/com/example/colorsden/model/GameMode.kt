package com.example.colorsden.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "game_mode")
data class GameMode (
    @PrimaryKey val gmid: Int,
    @NotNull @ColumnInfo(name = "gm_name") val gmName: String
)