package eu.tutorials.memess

import android.annotation.SuppressLint
import android.content.Intent
import android.media.tv.TvContract.WatchNextPrograms
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondActivity : AppCompatActivity() {
    lateinit var btnNexttwo: Button
    lateinit var btnPrevious:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnNexttwo = findViewById(R.id.btnNexttwo)
        btnPrevious = findViewById(R.id.btnPrevious)
        btnNexttwo.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnPrevious.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
         }

    }






