package hr.foi.rampu.project.eventbuddy.activities

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import hr.foi.rampu.project.eventbuddy.R
import hr.foi.rampu.project.eventbuddy.database.EventsDao
import hr.foi.rampu.project.eventbuddy.database.UsersDao
import java.text.SimpleDateFormat
import java.util.Locale
import hr.foi.rampu.project.eventbuddy.helpers.LoggedInUser
import java.time.LocalDate
import java.util.Date

class EventDetails : AppCompatActivity() {
    val edao = EventsDao()
    private val sdfDateTime: SimpleDateFormat = SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.ENGLISH)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_details)
        val eventName = intent.getStringExtra("eventName")
        val eventID = intent.getStringExtra("eventId")

        val dobivenEvent = edao.getEventById(eventID!!.toInt())!!
        Log.e("EVENT", ""+dobivenEvent.name)
        findViewById<TextView>(R.id.tv_event_details_time_date).text = sdfDateTime.format(dobivenEvent.date)
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

        val buttonClick2 = findViewById<Button>(R.id.btn_event_details_number_of_participants)
        buttonClick2.setOnClickListener{
            val korisnici =  edao.getAllParticipantsOnEvent(eventID)
            Log.e("KORISNICI", korisnici.toString())

            val layout = LinearLayout(this)
            layout.orientation = LinearLayout.VERTICAL

            for (k in korisnici) {
                val button = Button(this)
                button.isAllCaps = false
                button.text = k.name + " " + k.surname
                button.setOnClickListener {
                    Toast.makeText(this, "Odabran: ${k.name} ${k.surname} ${k.id} ", Toast.LENGTH_SHORT).show()
                }
                layout.addView(button)
            }

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Sudionici")
            builder.setView(layout)
            builder.setNegativeButton("Odustani") { dialog, _ ->
                dialog.dismiss()
            }
            val dialog = builder.create()
            dialog.show()
        }

        val buttonSubscribe = findViewById<Button>(R.id.btn_event_details_subscribe)
        val buttonParticipants = findViewById<TextView>(R.id.btn_event_details_number_of_participants)

        var isSubbed: Boolean = edao.isUserSubscribedOnEvent(LoggedInUser.user!!.id, dobivenEvent.id)
        if (isDateInPast(dobivenEvent.date)) buttonSubscribe.visibility = View.GONE
        buttonSubscribe.text = if (isSubbed) "Napusti događaj" else "Pretplati se"
        buttonSubscribe.setOnClickListener {
            if (isSubbed) {
                edao.unsubscribeUserOnEvent(LoggedInUser.user!!, dobivenEvent)
                buttonSubscribe.text = "Pretplati se"
            } else {
                edao.subscribeUserOnEvent(LoggedInUser.user!!, dobivenEvent)
                buttonSubscribe.text = "Napusti događaj"
            }
            isSubbed = !isSubbed
            buttonParticipants.text = "Sudionici:${edao.getNumberOfParticipants(dobivenEvent.id)}"
        }
    }

    private fun isDateInPast(date: Date): Boolean {
        val currentDate = Date()
        return date.before(currentDate)
    }
}