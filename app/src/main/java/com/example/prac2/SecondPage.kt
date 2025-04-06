package com.example.prac2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_page)

        val button: Button =findViewById(R.id.button);
        var text1:EditText=findViewById(R.id.text)
        val result=intent.getStringExtra("text")
        text1.setText(result)
        button.setOnClickListener({
            val intent = Intent(this,initialPage::class.java)
            startActivity(intent)
        })
    }
}