package com.example.teenconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    private val SPLASH_DELAY: Long = 2000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Handle Transition
        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, LoginActivity::class.java);
            startActivity(intent);
        }, SPLASH_DELAY)
    }
}