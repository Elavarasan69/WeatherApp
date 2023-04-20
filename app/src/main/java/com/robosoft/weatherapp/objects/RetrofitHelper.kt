package com.robosoft.weatherapp.objects

import com.robosoft.weatherapp.interfaces.WeatherApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    private val client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder().baseUrl("https://api.openweathermap.org/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun getInstance() : WeatherApi{
        return retrofit.create(WeatherApi::class.java)
    }
}