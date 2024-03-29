package com.example.android_fresco_example

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_fresco_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val uri: Uri = Uri.parse("https://raw.githubusercontent.com/facebook/fresco/main/docs/static/logo.png")
            binding.simpleDraweeView.setImageURI(uri)
        }
    }
}
