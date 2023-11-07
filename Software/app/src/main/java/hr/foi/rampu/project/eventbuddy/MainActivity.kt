package hr.foi.rampu.project.eventbuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import hr.foi.rampu.project.eventbuddy.activities.StartScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.button)
        buttonClick.setOnClickListener {
            val intent = Intent(this, StartScreen::class.java)
            startActivity(intent)
        }
    }
}