package hr.foi.rampu.project.eventbuddy.helpers

import hr.foi.rampu.project.eventbuddy.entities.Event
import java.util.Date

object MockDataLoader {


    val mutableList: MutableList<Event> = mutableListOf(Event("Sober", Date(), Date(), "Varaždin", 20, 70),
        Event("Infogamer", Date(), Date(), "Zagreb", 12876, 20000),
        Event("BruciFER", Date(), Date(), "Zagreb", 234, 500))

    fun getDemoData(): MutableList<Event> {
        return mutableList
    }

    fun addEvent(event: Event){
        mutableList.add(event)
    }
}