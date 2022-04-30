package com.dggorbachev.innopolisweatherapp.feature.weather_screen.domain

import com.dggorbachev.innopolisweatherapp.feature.weather_screen.data.api.WeatherRepo
import com.dggorbachev.innopolisweatherapp.feature.weather_screen.domain.model.WeatherDomainModel

class WeatherInteractor(private val repo: WeatherRepo) {
    suspend fun getWeather(): WeatherDomainModel {
        return repo.getWeather()
    }
}