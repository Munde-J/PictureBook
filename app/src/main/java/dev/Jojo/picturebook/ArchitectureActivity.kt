package dev.Jojo.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ArchitectureActivity : AppCompatActivity() {
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_architecture)
        btnNext= findViewById(R.id.btnBack)
        btnNext.setOnClickListener {
            val intent = Intent(this,WallpaperActivity::class.java)
            startActivity(intent)
        }

    }
}