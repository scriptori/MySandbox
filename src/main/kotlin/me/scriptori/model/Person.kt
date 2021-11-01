package me.scriptori.model

open class Person(
    @Transient open var name: String,
    @Transient open var age: Int,
    @Transient open var gender: Gender = Gender.UNDEFINED
)

enum class Gender {
    MALE,
    FEMALE,
    UNDEFINED
}
