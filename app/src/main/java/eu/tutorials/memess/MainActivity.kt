 package eu.tutorials.memess

import android.annotation.SuppressLint
import android.content.Intent
import android.media.tv.TvContract.WatchNextPrograms
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

 class MainActivity : AppCompatActivity() {
    lateinit var btnNext:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        btnNext = findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}