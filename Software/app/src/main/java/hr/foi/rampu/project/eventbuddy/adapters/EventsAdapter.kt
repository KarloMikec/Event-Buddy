package hr.foi.rampu.project.eventbuddy.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import hr.foi.rampu.project.eventbuddy.R
import hr.foi.rampu.project.eventbuddy.entities.Event
import java.text.SimpleDateFormat
import java.util.Locale

class EventsAdapter(private val eventsList: MutableList<Event>) :
    RecyclerView.Adapter<EventsAdapter.EventViewHolder>() {
    inner class EventViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val sdfDate: SimpleDateFormat = SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH)
        private val sdfTime: SimpleDateFormat = SimpleDateFormat("HH:mm", Locale.ENGLISH)

        private val eventName: TextView
        private val eventDate: TextView
        private val eventTime: TextView
        private val eventLocation: TextView
        private val eventParticipants: TextView
        private val eventPlaces: TextView

        init {
            eventName = view.findViewById(R.id.tv_event_name)
            eventDate = view.findViewById(R.id.tv_event_date)
            eventTime = view.findViewById(R.id.tv_event_time)
            eventLocation = view.findViewById(R.id.tv_event_location)
            eventParticipants = view.findViewById(R.id.tv_event_participants)
            eventPlaces = view.findViewById(R.id.tv_event_places)
        }

        fun bind(event: Event) {
            eventName.text = event.name
            eventDate.text = sdfDate.format(event.date)
            eventTime.text = sdfTime.format(event.time)
            eventLocation.text = event.location
            eventParticipants.text = event.participants.toString()
            //eventPlaces.text = event.places.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val eventView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.event_list_item, parent, false)
        return EventViewHolder(eventView)
    }

    override fun getItemCount(): Int {
        return eventsList.size
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.bind(eventsList[position])
    }
}