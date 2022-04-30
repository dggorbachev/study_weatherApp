package com.dggorbachev.innopolisweatherapp.feature.weather_screen.data.api

import com.dggorbachev.innopolisweatherapp.feature.weather_screen.domain.model.WeatherDomainModel

interface WeatherRepo {
    suspend fun getWeather(): WeatherDomainModel
}