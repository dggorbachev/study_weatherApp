package com.dggorbachev.innopolisweatherapp.feature.weather_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class WeatherWindModel(
    @SerializedName("deg")
    val deg: String
)