package hr.foi.rampu.project.eventbuddy.helpers

import hr.foi.rampu.project.eventbuddy.entities.Event
import hr.foi.rampu.project.eventbuddy.entities.User
import java.util.Date

object MockDataLoader {


    val mutableList: MutableList<Event> = mutableListOf()

    val registeredUsers: MutableList<User> = mutableListOf(User("Karlo", "Mikec", "admin", "admin", true ))

    var logedInUser: User? = null

    fun getDemoData(): MutableList<Event> {
        return mutableList
    }

    fun addEvent(event: Event){
        mutableList.add(event)
    }

    fun getDemoUsers(): MutableList<User> {
        return registeredUsers
    }

    fun registerUser(user: User) {
        registeredUsers.add(user)
    }
    fun provjeriAkoPostoji(korime: String): Boolean{
        val dobiveniUser = getDemoUsers().find { x -> x.korime == korime}
        return dobiveniUser != null
    }
    fun provjeriLozinku(korime: String, lozinka: String): Boolean{
        val dobiveniUser = getDemoUsers().find { x -> x.korime == korime}
        if(dobiveniUser == null){
            return false
        }
        if(dobiveniUser.lozinka == lozinka){
            logedInUser = dobiveniUser
            return true
        }
        return false
    }

    fun spremiNovePodatke(noviPodaciUser: User){
        val stariPodaciUser = getDemoUsers().find { x -> x.korime == noviPodaciUser.korime}
        getDemoUsers().remove(stariPodaciUser)
        getDemoUsers().add(noviPodaciUser)
        logedInUser = noviPodaciUser
    }
}