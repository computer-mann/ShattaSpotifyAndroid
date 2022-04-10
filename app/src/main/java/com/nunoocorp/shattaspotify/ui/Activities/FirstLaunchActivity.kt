package com.nunoocorp.shattaspotify.ui.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.nunoocorp.shattaspotify.R

class FirstLaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_launch)

        var button = findViewById<Button>(R.id.goToLoginBtn)
        button.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}