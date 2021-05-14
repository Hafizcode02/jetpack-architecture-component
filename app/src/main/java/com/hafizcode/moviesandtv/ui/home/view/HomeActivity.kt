package com.hafizcode.moviesandtv.ui.home.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hafizcode.moviesandtv.R
import com.hafizcode.moviesandtv.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)
    }
}