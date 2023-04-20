package com.robosoft.weatherapp.dataclass

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fav_tb")
data class FavouriteData(
    @PrimaryKey(autoGenerate = true) val id: Long?,
    @ColumnInfo(name = "city") val city: String?,
    @ColumnInfo(name = "fav") val fav: String?,
    @ColumnInfo(name = "temperature") val temperature: String?,
    @ColumnInfo(name = "climateText") val climateText: String?
)
