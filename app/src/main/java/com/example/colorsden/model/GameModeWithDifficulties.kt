package com.example.colorsden.model

import androidx.room.Embedded
import androidx.room.Relation

data class GameModeWithDifficulties (
    @Embedded val gameMode: GameMode,
    @Relation(
        parentColumn = "gmid",
        entityColumn = "gmid"
    )
    val difficulties: List<Difficulty>
)