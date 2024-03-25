package com.example.tugasmcdonarius

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.btnLogin)

        button?.setOnClickListener(View.OnClickListener { // Membuat intent eksplisit untuk pindah ke activity Home
            val intent = Intent(this@MainActivity, home::class.java)
            startActivity(intent)
        })
    }
}