package com.example.apksederhanalip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun submit(view: View) {
        val namaEditText = findViewById<EditText>(R.id.et_nama)
        val nama = namaEditText.text.toString()
        val submit = Toast.makeText(applicationContext, nama, Toast.LENGTH_SHORT).show()
    }
}