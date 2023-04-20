package com.robosoft.weatherapp.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/robosoft/weatherapp/interfaces/WeatherApi;", "", "getData", "Lretrofit2/Call;", "Lcom/robosoft/weatherapp/dataclass/WeatherData;", "City", "", "getWeatherData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WeatherApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/data/2.5/weather?q=Karur&APPID=c1ce11af5f5e6b87d93ee0f41f03fc9b")
    public abstract java.lang.Object getWeatherData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Call<com.robosoft.weatherapp.dataclass.WeatherData>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/data/2.5/weather?&APPID=c1ce11af5f5e6b87d93ee0f41f03fc9b")
    public abstract retrofit2.Call<com.robosoft.weatherapp.dataclass.WeatherData> getData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String City);
}