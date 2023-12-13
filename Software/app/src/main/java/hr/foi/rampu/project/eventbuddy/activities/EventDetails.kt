package hr.foi.rampu.project.eventbuddy.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import hr.foi.rampu.project.eventbuddy.R
import hr.foi.rampu.project.eventbuddy.database.EventsDao

class EventDetails : AppCompatActivity() {
    val edao = EventsDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_details)
        val eventName = intent.getStringExtra("eventName")

        val dobivenEvent = edao.getEventByName(eventName.toString())!!
        Log.e("EVENT", ""+dobivenEvent.name)
        findViewById<TextView>(R.id.tv_event_details_title).text = dobivenEvent.name
        findViewById<TextView>(R.id.tv_event_details_location).text = dobivenEvent.location
        findViewById<TextView>(R.id.tv_event_details_overview).text = dobivenEvent.overview
        findViewById<TextView>(R.id.btn_event_details_number_of_participants).text = "Sudionici:" + dobivenEvent.participants.toString()

        val buttonClick = findViewById<Button>(R.id.btn_event_details_back)
        buttonClick.setOnClickListener {
            val intent = Intent(this, StartScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}