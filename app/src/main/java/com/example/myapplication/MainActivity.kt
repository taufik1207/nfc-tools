package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et_username = findViewById(R.id.username) as EditText
        var et_password = findViewById(R.id.password) as EditText
        var btn_submit = findViewById(R.id.btnSubmit) as Button

        btn_submit.setOnClickListener {
            val username = et_username.text.toString()
            val password = et_password.text.toString()

            if(username == "" && password == "") {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this@MainActivity, "Login gagal", Toast.LENGTH_LONG).show()
            }
        }
    }
}
