package com.example.firstdemoapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstdemoapp.databinding.ActivityChangeColorOfBackgroundBinding
import com.example.firstdemoapp.databinding.ActivityMainBinding

class ChangeColorOfBackground : AppCompatActivity() {
    private lateinit var binding: ActivityChangeColorOfBackgroundBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityChangeColorOfBackgroundBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDark.setOnClickListener {
            binding.main.setBackgroundResource(R.color.black)
        }

        binding.btnLight.setOnClickListener {
            binding.main.setBackgroundResource(R.color.Green)
        }
    }
}