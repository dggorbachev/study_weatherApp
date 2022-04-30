package com.dggorbachev.innopolisweatherapp.feature.weather_screen.data.api

import com.dggorbachev.innopolisweatherapp.feature.weather_screen.data.api.model.WeatherModel

class WeatherRemoteSource(private val api: WeatherApi) {
    suspend fun getWeather(): WeatherModel {
        return api.getWeather("Moscow")
    }
}