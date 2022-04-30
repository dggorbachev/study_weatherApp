package com.dggorbachev.innopolisweatherapp.feature.weather_screen.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.dggorbachev.innopolisweatherapp.R
import com.dggorbachev.innopolisweatherapp.feature.weather_screen.domain.model.WeatherDomainModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class WeatherScreenActivity : AppCompatActivity() {
    val weatherScreenViewModel by viewModel<WeatherScreenViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        weatherScreenViewModel.liveData.observe(this, Observer(::render))
        weatherScreenViewModel.requestWeather()
    }

    private fun render(state: WeatherDomainModel) {
        findViewById<TextView>(R.id.tv_temperature).let { it.text = state.temperature }
        findViewById<TextView>(R.id.tv_min_temperature).let { it.text = state.temp_min }
        findViewById<TextView>(R.id.tv_max_temperature).let { it.text = state.temp_max }
        findViewById<TextView>(R.id.tv_humidity).let { it.text = state.humidity }
        findViewById<TextView>(R.id.tv_wind_dir).let { it.text = state.deg }
    }
}