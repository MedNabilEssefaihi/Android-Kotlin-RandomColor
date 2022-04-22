package com.example.randomcolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.randomcolor.R
import com.example.randomcolor.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        onListeners()
    }

    private fun onListeners() {
        val boxes = listOf(
            binding.box1, binding.box2, binding.box3, binding.box4, binding.box5,
            binding.box6, binding.box7, binding.box8, binding.box9, binding.box10, binding.box11,
        )
        boxes.forEach { box ->
            box.setOnClickListener {
                it.setBackgroundColor(Color.parseColor(randomColor()))
            }
        }
    }

    private fun randomColor(): String {
        val colors = listOf(
            "#fb8500",
            "#219ebc",
            "#a4133c",
            "#e63946",
            "#e85d04",
            "#fae1dd",
            "#7f5539",
            "#006d77",
            "#ff006e",
            "#8338ec",
        )
        return colors[Random.nextInt(0, 10)]
    }
}