package com.therealsanjeev.increaseheight.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Nutrient::class), version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun nutritionDao(): NutritionDao
}