package com.example.tugasmcdonarius

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import register

class forgotpassword : AppCompatActivity(), View.OnClickListener {

    private lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button->{
                val intent = Intent(this@forgotpassword,register::class.java)
                startActivity(intent)
            }

        }

    }
}
