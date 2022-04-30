package com.dggorbachev.innopolisweatherapp.feature.weather_screen.data

import com.dggorbachev.innopolisweatherapp.feature.weather_screen.data.api.model.WeatherModel
import com.dggorbachev.innopolisweatherapp.feature.weather_screen.domain.model.WeatherDomainModel

fun WeatherModel.toDomain(): WeatherDomainModel {
    return WeatherDomainModel(
        this.main.temp,
        this.main.tempMin,
        this.main.tempMax,
        this.main.humidity,
        this.wind.deg
    )
}