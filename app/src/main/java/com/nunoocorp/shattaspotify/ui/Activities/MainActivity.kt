package com.nunoocorp.shattaspotify.ui.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nunoocorp.shattaspotify.R

class MainActivity : AppCompatActivity() {
     var isLoggedIn:Boolean =true
    override fun onCreate(savedInstanceState: Bundle?) {
        if(!isLoggedIn){
            startActivity(Intent(this,FirstLaunchActivity::class.java))
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}