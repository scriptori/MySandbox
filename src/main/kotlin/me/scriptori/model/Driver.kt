package me.scriptori.model

data class Driver(
    var name: String,
    var age: Int,
    var gender: Gender = Gender.UNDEFINED
)

enum class Gender {
    MALE,
    FEMALE,
    UNDEFINED
}
