package com.example.firstdemoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstdemoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDownload.setOnClickListener {
            Toast.makeText(applicationContext,"Downloading...",Toast.LENGTH_SHORT).show()
        }
        binding.btnUpload.setOnClickListener {
            Toast.makeText(applicationContext,"Uploading...",Toast.LENGTH_SHORT).show()
            intent = Intent(applicationContext,ChangeColorOfBackground::class.java)
            startActivity(intent)
        }
    }
}