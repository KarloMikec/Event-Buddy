package hr.foi.rampu.project.eventbuddy.fragments

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton
import hr.foi.rampu.project.eventbuddy.R
class MyEventsCreateEventFragment : Fragment() {
    private lateinit var btnCreateNewEvent: FloatingActionButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_events_create_event, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnCreateNewEvent = view.findViewById(R.id.fab_my_events_create_event)
        btnCreateNewEvent.setOnClickListener {
            showDialog()
        }
    }

    fun showDialog(){
        val newTaskDialogView = LayoutInflater
            .from(context)
            .inflate(R.layout.new_event_dialog, null)

        AlertDialog.Builder(context)
            .setView(newTaskDialogView)
            .setTitle("Kreiraj novi događaj")
            .setPositiveButton("Kreiraj") { _, _ ->
            }
            .show()
    }
}