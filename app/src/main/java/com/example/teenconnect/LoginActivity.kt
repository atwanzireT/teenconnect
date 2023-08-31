package com.example.teenconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val login: Button = findViewById(R.id.loginBtn);
        login.setOnClickListener{
            startActivity(Intent(this@LoginActivity, MainActivity::class.java));
            Toast.makeText(this@LoginActivity, "Logging in ...", Toast.LENGTH_LONG).show();
        }
    }
    fun noAcc(view: View) {
        startActivity(Intent(this@LoginActivity, SignupActivity::class.java));
    }
}