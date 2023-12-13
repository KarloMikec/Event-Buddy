package hr.foi.rampu.project.eventbuddy.database

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
   // fun updateUser(user: User)
}