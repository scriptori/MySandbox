package me.scriptori.test

import java.io.File
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import me.scriptori.model.Driver
import me.scriptori.model.Gender
import me.scriptori.model.Type
import me.scriptori.test.DriverTest.TestDrivers
import me.scriptori.util.JsonUtil

class JsonUtilTest {
    @Test
    fun `writing a list to a json file`() {
        val drivers = TestDrivers(
            listOf(
                Driver("John", 34, Gender.MALE, Type.B),
                Driver("Claudio", 34, Gender.MALE, Type.C),
                Driver("Paul", 67, Gender.MALE, Type.B),
                Driver("Mary", 54, Gender.FEMALE, Type.A)
            )
        )
        JsonUtil.writeToFile("drivers", ".", drivers)
        val file = File("./drivers.json")
        assertTrue { file.exists() }
        val testDrivers = JsonUtil.fromJsonFile(file, TestDrivers::class.java)
        assertContentEquals(drivers.drivers, testDrivers.drivers)
        file.delete()
        assertFalse { file.exists() }
    }
}
