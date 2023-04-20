package com.robosoft.weatherapp.interfaces;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\'J\u001c\u0010\u000b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\'\u00a8\u0006\r"}, d2 = {"Lcom/robosoft/weatherapp/interfaces/WeatherDetailsDAO;", "", "getAllData", "", "Lcom/robosoft/weatherapp/dataclass/WeatherDetails;", "getSelectedCity", "city", "", "insert", "", "weatherDetails", "update", "favorite", "app_debug"})
public abstract interface WeatherDetailsDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM weather_tb")
    public abstract java.util.List<com.robosoft.weatherapp.dataclass.WeatherDetails> getAllData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM weather_tb WHERE city == :city")
    public abstract java.util.List<com.robosoft.weatherapp.dataclass.WeatherDetails> getSelectedCity(@org.jetbrains.annotations.NotNull()
    java.lang.String city);
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.robosoft.weatherapp.dataclass.WeatherDetails weatherDetails);
    
    @androidx.room.Query(value = "UPDATE weather_tb SET fav = :favorite  WHERE city = :city")
    public abstract void update(@org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    java.lang.String favorite);
}