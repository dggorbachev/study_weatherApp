package com.dggorbachev.innopolisweatherapp.feature.weather_screen.data.api

import com.dggorbachev.innopolisweatherapp.feature.weather_screen.data.api.model.WeatherModel
import retrofit2.http.GET
import retrofit2.http.Query

// api key 1384a7fcd9efed7440433a9d3c4fd1f1

// https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
interface WeatherApi {
    @GET("weather")
    suspend fun getWeather(
        @Query("q") cityName: String,
        @Query("appid") apiKey: String = "1384a7fcd9efed7440433a9d3c4fd1f1",
        @Query("units") units: String = "metric"
    ): WeatherModel
}