package com.example.colorsden.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.colorsden.data.dao.GameModeDao
import com.example.colorsden.data.dao.GameModeWithDifficultiesDao
import com.example.colorsden.model.Difficulty
import com.example.colorsden.model.GameMode

@Database(entities = [GameMode::class, Difficulty::class], version = 1)
abstract class ColorsDenDatabase : RoomDatabase() {

    abstract fun gameModeDao(): GameModeDao
    abstract fun gameModeWithDifficultiesDao(): GameModeWithDifficultiesDao

    companion object {
        @Volatile
        private var INSTANCE: ColorsDenDatabase? = null

        fun getDatabase(context: Context): ColorsDenDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    ColorsDenDatabase::class.java,
                    "colors_den_database")
                    .createFromAsset("database/colors_den.db")
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }

}