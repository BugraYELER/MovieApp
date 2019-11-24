package com.example.bugrayeler.movieapp

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        showUser()
    }
    private fun showUser(){
        val preference = getSharedPreferences("MovieApp", Context.MODE_PRIVATE)
        val email = preference.getString("email","User Not Found")

        Toast.makeText(this,"Email= $email", Toast.LENGTH_SHORT).show()
    }
}
