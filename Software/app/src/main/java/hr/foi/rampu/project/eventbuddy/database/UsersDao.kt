package hr.foi.rampu.project.eventbuddy.database

import android.util.Log
import hr.foi.rampu.project.eventbuddy.entities.Role
import hr.foi.rampu.project.eventbuddy.entities.User

class UsersDao {

    fun getUserByUsername(username: String): User? {
        var sql = "SELECT * FROM korisnik WHERE korime = '${username}'"
        val set = Database.execute(sql)
        while (set.next()){
            return User(
                id = set.getString("ID").toInt(),
                username = set.getString("korime"),
                name = set.getString("ime"),
                surname = set.getString("prezime"),
                password = set.getString("lozinka"),
                warnings = set.getString("upozorenja").toInt(),
            )
        }
        return null
    }

    fun getRoles(id: Int): List<Role> {
        val sql = """
            SELECT uloga.ID, uloga.Naziv
            FROM uloga, uloge, korisnik
            WHERE
                uloge.ID_korisnik = korisnik.ID AND
                uloge.ID_uloga = uloga.ID AND
                korisnik.ID = ${id}
        """.trimIndent()

        val set = Database.execute(sql)
        val roles: MutableList<Role> = mutableListOf()

        while(set.next()){
            val role = Role(
                id = set.getString("ID").toInt(),
                name = set.getString("naziv")
            )
            roles += role
        }
        return roles
    }

    fun addUser(user: User){
        var sql = """
            INSERT INTO korisnik (korime, ime, prezime, lozinka)
            VALUES ('${user.username}', '${user.name}', '${user.surname}', '${user.password}')
        """.trimIndent()
        Database.executeUpdate(sql)
    }


}