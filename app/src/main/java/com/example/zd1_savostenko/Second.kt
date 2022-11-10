package com.example.zd1_savostenko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView

class Second : AppCompatActivity() {
    lateinit var spinner: Spinner
    lateinit var loginText: TextView
    lateinit var movie:TextView
    lateinit var log: String
    lateinit var mov: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        spinner = findViewById(R.id.spinner)
        loginText = findViewById(R.id.loginText)
        movie = findViewById(R.id.myMovie)
        log = getIntent().getStringExtra("login").toString()
        loginText.setText(log)
    }

    fun changeMovie(view: android.view.View)
    {
        mov = spinner.getSelectedItem().toString()
        movie.setText(mov)
    }

}