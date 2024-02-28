package com.davigledson.travelconsuption

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davigledson.travelconsuption.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        //View -> elemento do app
    // Binding -> ligacao com o  nosso codigo


    }
    fun calculate(){
        
    }
}