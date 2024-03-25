package com.example.tugasmcdonarius

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class home : AppCompatActivity() {
    private var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        findViewById<Button>(R.id.btnShare).also { button = it }
        button?.setOnClickListener(View.OnClickListener { // Membuat intent implisit untuk berbagi teks
            val shareIntent = Intent()
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Nama saya Donarius Alop Kalakmabin")
            shareIntent.type = "text/plain"
            startActivity(Intent.createChooser(shareIntent, "Bagikan melalui"))
        })
    }
}