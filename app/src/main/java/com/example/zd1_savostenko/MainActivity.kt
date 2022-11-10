package com.example.zd1_savostenko

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.text.TextUtils.isEmpty
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var login: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login = findViewById(R.id.login);
        login = findViewById(R.id.password);
    }

    fun nextPage(view: android.view.View)
    {
        if (login.toString() == "login" || password.toString() == "password")
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }
        else
        {
            val intent = Intent(this@MainActivity,Second::class.java)
            intent.putExtra("login", login.text)
        }
    }
}