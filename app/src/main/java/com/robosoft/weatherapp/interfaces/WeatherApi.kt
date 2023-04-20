package com.robosoft.weatherapp.interfaces

import com.robosoft.weatherapp.dataclass.WeatherData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherApi {

    @GET("/data/2.5/weather?q=Karur&APPID=c1ce11af5f5e6b87d93ee0f41f03fc9b")
    suspend fun getWeatherData(): Call<WeatherData>

    @GET("/data/2.5/weather?&APPID=c1ce11af5f5e6b87d93ee0f41f03fc9b")
    fun getData(@Query("q") City: String): Call<WeatherData>
}