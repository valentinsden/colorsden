package com.example.colorsden.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity
data class Difficulty (
    @PrimaryKey val did: Int,
    @NotNull @ColumnInfo(name = "difficulty_name") val difficultyName: String,
    @NotNull val gmid: Int
)