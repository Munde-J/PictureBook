package  dev.Jojo.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AnimalActivity : AppCompatActivity() {
    lateinit var btnBack4a: Button
    lateinit var btnNext4b: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)
        btnBack4a = findViewById(R.id.btnBack4a)
        btnNext4b = findViewById(R.id.btnNext4b)

        btnBack4a.setOnClickListener {
            val intent = Intent(this,WallpaperActivity::class.java)
            startActivity(intent)
        }
        btnNext4b.setOnClickListener {
           val intent=Intent(this,HealthActivity::class.java)
            startActivity(intent)
        }

    }
}