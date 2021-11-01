package me.scriptori.model

class Driver(
    override var name: String,
    override var age: Int,
    override var gender: Gender,
    var type: Type = Type.A
) : Person(name, age, gender) {
    override fun equals(other: Any?): Boolean {
        other as Driver
        return this.name == other.name && this.age == other.age && this.gender == other.gender &&
            this.type == other.type
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        result = 31 * result + gender.hashCode()
        result = 31 * result + type.hashCode()
        return result
    }
}

enum class Type {
    A,
    B,
    C
}
