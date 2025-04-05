package com.example.prac2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class initialPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_initial_page)

        val button: Button =findViewById(R.id.button);
        button.setOnClickListener({
            val intent = Intent(this, SecondPage::class.java)
            startActivity(intent)
        })
    }
}