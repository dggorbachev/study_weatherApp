package com.dggorbachev.innopolisweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.dggorbachev.innopolisweatherapp.feature.weather_screen.ui.WeatherScreenActivity

class MainActivity : AppCompatActivity() {
    private val presenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = "Привет"
//        val textView = findViewById<TextView>(R.id.tv_hello)
//        textView.text = presenter.getTemperature()

//        val list = mutableListOf<Int>(1, 2, 3, 4, 5)
//        val filteredList = list.filter {
//            it == 3
//        }
//        Log.d("TAG", "$filteredList")
//
//        filteredList.let { list ->
//            textView.text = list.toString()
//        }

        val weatherButton = findViewById<Button>(R.id.btn_weather)
        weatherButton.setOnClickListener {
            Intent(this, WeatherScreenActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}