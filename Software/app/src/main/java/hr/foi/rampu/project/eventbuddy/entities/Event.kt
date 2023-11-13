package hr.foi.rampu.project.eventbuddy.entities

import java.util.Date

class Event (
    val name: String,
    val date: Date,
    val time: Date,
    val location: String,
    val participants: Int,
    val places: Int
)