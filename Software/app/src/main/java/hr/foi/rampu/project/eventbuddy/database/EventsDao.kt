package hr.foi.rampu.project.eventbuddy.database

import android.util.Log
import hr.foi.rampu.project.eventbuddy.entities.Event
import java.text.SimpleDateFormat
import java.util.Locale

class EventsDao {
    fun getAllEvents(includePast: Boolean = false): List<Event> {
        // TODO("Napraviti da se ne prikazuju događaji ulogiranog korisnika")
        var sql = "SELECT * FROM dogadaj"

        if (!includePast) {
            sql = """
                SELECT * FROM dogadaj
                WHERE
                    CAST(datum as date) > CAST(GETDATE() as date) AND ID_status = 1
                ORDER BY
                    datum
            """.trimIndent()
        }

        val set = Database.execute(sql)
        val list: MutableList<Event> = mutableListOf()
        while(set.next()){
            val event = Event(
                id = set.getString("ID").toInt(),
                name = set.getString("naziv"),
                overview = set.getString("opis"),
                date = SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH)
                    .parse(set.getString("datum"))!!,
                time = SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH)
                    .parse(set.getString("datum"))!!,
                location = set.getString("mjesto"),
                categoryId = set.getString("ID_kategorija").toInt(),
                statusId = set.getString("ID_status").toInt(),
                userId = set.getString("ID_korisnik").toInt()
            )
            list += event
            Log.i("CATEGORY", "${event.category.id} - ${event.category.name}")
        }
        return list
    }

    fun getNumberOfParticipants(id: Int): Int {
        val sql = """
            SELECT COUNT(*) as broj_sudionika
            FROM sudionici
            LEFT JOIN korisnik
            ON ID = ID_korisnik
            WHERE ID_dogadaj = ${id}
        """.trimIndent()
        val set = Database.execute(sql)
        while(set.next()){
            return set.getString("broj_sudionika").toInt()
        }
        return 0
    }

    fun getEventByName(eventName: String): Event? {
        val sql = "SELECT * FROM dogadaj WHERE naziv='${eventName}'";
        Log.e("SQL",sql)
        val set = Database.execute(sql);
        var eventDobiven: Event? = null
        while(set.next()){
            val eventDobiven = Event(
                id = set.getString("ID").toInt(),
                name = set.getString("naziv"),
                overview = set.getString("opis"),
                date = SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH)
                    .parse(set.getString("datum"))!!,
                time = SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH)
                    .parse(set.getString("datum"))!!,
                location = set.getString("mjesto"),
                categoryId = set.getString("ID_kategorija").toInt(),
                statusId = set.getString("ID_status").toInt(),
                userId = set.getString("ID_korisnik").toInt()
            )
            return eventDobiven
        }
        return eventDobiven
    }
}
