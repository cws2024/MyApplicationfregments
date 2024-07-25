package com.example.myapplicationfregments

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplicationfregments.databinding.ActivityMainBinding
import com.example.myapplicationfregments.fregment.Intrection_interface

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var Intrection_interfaceace:Intrection_interface?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
      binding.buttonPanel.setOnClickListener{
      }

    }
    fun changetext(){
        binding.buttonPanel.setText("Change by fregment")
    }
}

