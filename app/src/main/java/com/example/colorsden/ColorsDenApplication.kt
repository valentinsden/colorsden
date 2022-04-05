package com.example.colorsden

import android.app.Application
import com.example.colorsden.data.ColorsDenDatabase

class ColorsDenApplication : Application() {

    val database: ColorsDenDatabase by lazy { ColorsDenDatabase.getDatabase(this) }

}