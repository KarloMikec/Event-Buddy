package hr.foi.rampu.project.eventbuddy.database

import hr.foi.rampu.project.eventbuddy.entities.Event
import java.text.SimpleDateFormat
import java.util.Locale

class EventsDao {
    fun getAllEvents(): List<Event> {
        // TODO("Napraviti da se ne prikazuju događaji ulogiranog korisnika")
        val sql = "SELECT * FROM dogadaj"
        val set = Database.execute(sql)
        val list: MutableList<Event> = mutableListOf()
        while(set.next()){
            val event = Event(
                name = set.getString("naziv"),
                date = SimpleDateFormat("yyyy-MM-DD hh:mm:ss", Locale.ENGLISH)
                    .parse(set.getString("datum"))!!,
                time = SimpleDateFormat("yyyy-MM-DD hh:mm:ss", Locale.ENGLISH)
                    .parse(set.getString("datum"))!!,
                location = set.getString("mjesto"),
                participants = 0,
                places = 0
            )
            list += event
        }
        return list
    }
}
