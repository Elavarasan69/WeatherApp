package com.robosoft.weatherapp.dataclass;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u00c6\u0003J\t\u00102\u001a\u00020\u0017H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\t\u00105\u001a\u00020\tH\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\t\u00108\u001a\u00020\rH\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0010H\u00c6\u0003J\u0091\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u00c6\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010?\u001a\u00020\u0007H\u00d6\u0001J\t\u0010@\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-\u00a8\u0006A"}, d2 = {"Lcom/robosoft/weatherapp/dataclass/WeatherData;", "", "base", "", "clouds", "Lcom/robosoft/weatherapp/dataclass/Clouds;", "cod", "", "coord", "Lcom/robosoft/weatherapp/dataclass/Coord;", "dt", "id", "main", "Lcom/robosoft/weatherapp/dataclass/Main;", "name", "sys", "Lcom/robosoft/weatherapp/dataclass/Sys;", "timezone", "visibility", "weather", "", "Lcom/robosoft/weatherapp/dataclass/Weather;", "wind", "Lcom/robosoft/weatherapp/dataclass/Wind;", "(Ljava/lang/String;Lcom/robosoft/weatherapp/dataclass/Clouds;ILcom/robosoft/weatherapp/dataclass/Coord;IILcom/robosoft/weatherapp/dataclass/Main;Ljava/lang/String;Lcom/robosoft/weatherapp/dataclass/Sys;IILjava/util/List;Lcom/robosoft/weatherapp/dataclass/Wind;)V", "getBase", "()Ljava/lang/String;", "getClouds", "()Lcom/robosoft/weatherapp/dataclass/Clouds;", "getCod", "()I", "getCoord", "()Lcom/robosoft/weatherapp/dataclass/Coord;", "getDt", "getId", "getMain", "()Lcom/robosoft/weatherapp/dataclass/Main;", "getName", "getSys", "()Lcom/robosoft/weatherapp/dataclass/Sys;", "getTimezone", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/robosoft/weatherapp/dataclass/Wind;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class WeatherData {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String base = null;
    @org.jetbrains.annotations.NotNull()
    private final com.robosoft.weatherapp.dataclass.Clouds clouds = null;
    private final int cod = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.robosoft.weatherapp.dataclass.Coord coord = null;
    private final int dt = 0;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.robosoft.weatherapp.dataclass.Main main = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final com.robosoft.weatherapp.dataclass.Sys sys = null;
    private final int timezone = 0;
    private final int visibility = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.robosoft.weatherapp.dataclass.Weather> weather = null;
    @org.jetbrains.annotations.NotNull()
    private final com.robosoft.weatherapp.dataclass.Wind wind = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.robosoft.weatherapp.dataclass.WeatherData copy(@org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.robosoft.weatherapp.dataclass.Clouds clouds, int cod, @org.jetbrains.annotations.NotNull()
    com.robosoft.weatherapp.dataclass.Coord coord, int dt, int id, @org.jetbrains.annotations.NotNull()
    com.robosoft.weatherapp.dataclass.Main main, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.robosoft.weatherapp.dataclass.Sys sys, int timezone, int visibility, @org.jetbrains.annotations.NotNull()
    java.util.List<com.robosoft.weatherapp.dataclass.Weather> weather, @org.jetbrains.annotations.NotNull()
    com.robosoft.weatherapp.dataclass.Wind wind) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WeatherData(@org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.robosoft.weatherapp.dataclass.Clouds clouds, int cod, @org.jetbrains.annotations.NotNull()
    com.robosoft.weatherapp.dataclass.Coord coord, int dt, int id, @org.jetbrains.annotations.NotNull()
    com.robosoft.weatherapp.dataclass.Main main, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.robosoft.weatherapp.dataclass.Sys sys, int timezone, int visibility, @org.jetbrains.annotations.NotNull()
    java.util.List<com.robosoft.weatherapp.dataclass.Weather> weather, @org.jetbrains.annotations.NotNull()
    com.robosoft.weatherapp.dataclass.Wind wind) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robosoft.weatherapp.dataclass.Clouds component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robosoft.weatherapp.dataclass.Clouds getClouds() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getCod() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robosoft.weatherapp.dataclass.Coord component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robosoft.weatherapp.dataclass.Coord getCoord() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getDt() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robosoft.weatherapp.dataclass.Main component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robosoft.weatherapp.dataclass.Main getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robosoft.weatherapp.dataclass.Sys component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robosoft.weatherapp.dataclass.Sys getSys() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getTimezone() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.robosoft.weatherapp.dataclass.Weather> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.robosoft.weatherapp.dataclass.Weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robosoft.weatherapp.dataclass.Wind component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robosoft.weatherapp.dataclass.Wind getWind() {
        return null;
    }
}