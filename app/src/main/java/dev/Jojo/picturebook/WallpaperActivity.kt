package dev.Jojo.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WallpaperActivity : AppCompatActivity() {
    lateinit var btnBack3: Button
    lateinit var btnNext3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallpaper)
        btnBack3 = findViewById(R.id.btnBack3)
        btnBack3.setOnClickListener {
            val intent = Intent(this,ArchitectureActivity::class.java)
            startActivity(intent)
        }
        btnNext3 = findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent = Intent(this,AnimalActivity::class.java)
            startActivity(intent)
        }

    }
}