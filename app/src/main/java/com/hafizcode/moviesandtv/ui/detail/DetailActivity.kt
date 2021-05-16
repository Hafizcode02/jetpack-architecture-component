package com.hafizcode.moviesandtv.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hafizcode.moviesandtv.R

class DetailActivity : AppCompatActivity() {

    companion object {
        const val DATA_ID = "DATA_ID"
        const val DATA_TYPE = "DATA_TYPE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
}