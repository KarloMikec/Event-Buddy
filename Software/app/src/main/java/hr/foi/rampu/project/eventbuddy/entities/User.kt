package hr.foi.rampu.project.eventbuddy.entities

class User(
    val id: Int,
    val name: String,
    val surname: String,
    val username: String,
    val password: String,
    val warnings: Int
)