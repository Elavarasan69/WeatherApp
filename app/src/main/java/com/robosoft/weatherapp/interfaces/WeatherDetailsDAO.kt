package com.robosoft.weatherapp.interfaces

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.robosoft.weatherapp.dataclass.WeatherDetails


@Dao
interface WeatherDetailsDAO {

    @Query("SELECT * FROM weather_tb")
    fun getAllData(): List<WeatherDetails>

    @Query("SELECT * FROM weather_tb WHERE city == :city")
    fun getSelectedCity(city: String) : List<WeatherDetails>

    @Insert
    fun insert(weatherDetails: WeatherDetails)

    @Query("UPDATE weather_tb SET fav = :favorite  WHERE city = :city")
    fun update(city :String?, favorite : String?)
}