package com.example.youtubevideos

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import android.widget.SpinnerAdapter

abstract class MainActivity : AppCompatActivity(), SpinnerAdapter {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner: Spinner = findViewById(R.id.userlist)
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
                "Shape of you - Ed Sheeran", "Holy - Justin Bieber", "See you again - Wiz Khalifa ft. Charlie Puth",
                "One Piece Funny Moments", "Pop Star - Dj Khaled ft Drake", "Tom & Jerry", "Akosi Dogie Vlogs",
                "One piece - Kaido vs Luffy", "Nba Heated & Bloopers", "Titig - MC Einstein ft. Flow G, Yuri Dope, and Jekkpot"
        )
        users.sort()
    }
}