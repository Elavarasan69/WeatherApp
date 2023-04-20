package com.robosoft.weatherapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.robosoft.weatherapp.dataclass.WeatherDetails
import com.robosoft.weatherapp.interfaces.WeatherDetailsDAO

@Database(entities = [WeatherDetails::class], version = 2)
abstract class WeatherDB : RoomDatabase() {

    abstract fun weatherDetailsDao(): WeatherDetailsDAO

    companion object {

        @Volatile
        private var INSTANCE: WeatherDB? = null

        fun getDatabase(context: Context): WeatherDB {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WeatherDB::class.java,
                    "Weather_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}