package com.therealsanjeev.increaseheight.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NutritionDao{
    @Query("SELECT * FROM `nutrition list`")
    fun getAll(): List<Nutrient>

    @Query("SELECT * FROM `nutrition list` WHERE uid IN(:nutritionId)")
    fun loadAllById(nutritionId: IntArray): List<Nutrient>

    @Query("SELECT * FROM `nutrition list` WHERE food_name LIKE :foodName")
    fun findFoodName(foodName: String): Nutrient

    @Insert
    fun insertAll(vararg nutrient: Nutrient)

    @Delete
    fun deleteAll(nutrient: Nutrient)
}