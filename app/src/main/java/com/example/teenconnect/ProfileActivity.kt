package com.example.teenconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val profileIDLyout : LinearLayout = findViewById(R.id.idProfileIDLyout);

        profileIDLyout.bringToFront();
    }
}