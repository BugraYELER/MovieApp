package com.example.bugrayeler.movieapp

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUi()
    }
    private fun initUi() {

        button.setOnClickListener {
            val email = email.text.toString()
            val password = password.text.toString()
            saveUser(email, password)
            navigateDetailActivity()
        }
    }
    private fun navigateDetailActivity(){
         val detailIntent = Intent(this, MovieDetailActivity::class.java)
        startActivity(detailIntent)
    }

    private fun saveUser(email: String, password: String) {
        val preferences = getSharedPreferences("MovieApp", Context.MODE_PRIVATE)
        val editor = preferences.edit()
        editor.putString("email", email)
        editor.putString("password", password)
        editor.apply()
    }
}
