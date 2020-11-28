package com.therealsanjeev.increaseheight.database

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "Nutrition List")
data class Nutrient(
    @ColumnInfo @PrimaryKey(autoGenerate = true) var uid: Long = 0,
    @ColumnInfo(name = "food_name") val foodName: String?,
    //@ColumnInfo(name = "food_picture") val foodPicture: Bitmap?
    @Ignore val foodPicture: Bitmap?
)