package com.example.weightmanagement.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.weightmanagement.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val tv: TextView = findViewById(R.id.text_view)
        val tv: TextView = findViewById(R.id.myTextView)
        val tf: EditText = findViewById(R.id.myTextField)
        val btn: Button = findViewById(R.id.myButton)

        btn.setOnClickListener {
            val text = tf.text
            tv.text = "Welcome $text"
        }

    }
}
