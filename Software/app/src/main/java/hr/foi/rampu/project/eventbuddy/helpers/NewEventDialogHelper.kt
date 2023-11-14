package hr.foi.rampu.project.eventbuddy.helpers

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.view.View
import android.widget.EditText
import hr.foi.rampu.project.eventbuddy.R
import hr.foi.rampu.project.eventbuddy.entities.Event
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class NewEventDialogHelper(private val view: View) {

    private val selectedDateTime: Calendar = Calendar.getInstance()

    private val sdfDate = SimpleDateFormat("dd.MM.yyyy.", Locale.ENGLISH)
    private val sdfTime = SimpleDateFormat("HH:mm", Locale.ENGLISH)

    private val dateSelection = view.findViewById<EditText>(R.id.et_new_event_dialog_date)
    private val timeSelection = view.findViewById<EditText>(R.id.et_new_event_dialog_time)

    fun activateDateTimeListeners() {
        dateSelection.setOnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                DatePickerDialog(
                    view.context,
                    { _, year, monthOfYear, dayOfMonth ->
                        selectedDateTime.set(year, monthOfYear, dayOfMonth)
                        dateSelection.setText(sdfDate.format(selectedDateTime.time).toString())
                    },
                    selectedDateTime.get(Calendar.YEAR),
                    selectedDateTime.get(Calendar.MONTH),
                    selectedDateTime.get(Calendar.DAY_OF_MONTH),
                ).show()
                view.clearFocus()
            }
        }

        timeSelection.setOnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                TimePickerDialog(
                    view.context,
                    { _, hourOfDay, minute ->
                        selectedDateTime.set(Calendar.HOUR_OF_DAY, hourOfDay)
                        selectedDateTime.set(Calendar.MINUTE, minute)
                        timeSelection.setText(sdfTime.format(selectedDateTime.time).toString())
                    },
                    selectedDateTime.get(Calendar.HOUR_OF_DAY),
                    selectedDateTime.get(Calendar.MINUTE),
                    true
                ).show()
                view.clearFocus()
            }
        }
    }

    fun buildEvent(): Event {
        val eventName = view.findViewById<EditText>(R.id.et_new_event_dialog_eventName)
        val location = view.findViewById<EditText>(R.id.et_new_event_dialog_location)
        val participants = 0
        val places = view.findViewById<EditText>(R.id.et_new_event_dialog_places)

        val eventNameText = eventName.text.toString()
        val locationText = location.text.toString()
        val placesInt = Integer.parseInt(places.text.toString())
        return Event(eventNameText, selectedDateTime.time, selectedDateTime.time, locationText, participants, placesInt)
    }
}