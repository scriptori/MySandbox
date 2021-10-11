package me.scriptori.test

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import me.scriptori.DriverController
import me.scriptori.model.Driver
import me.scriptori.model.Gender

class DriverTest {

    @Test
    fun `Driver information using a list of Driver object model`() {
        val driversController = DriverController(
            listOf(
                Driver("John", 34, Gender.MALE),
                Driver("Claudio", 34, Gender.MALE),
                Driver("Paul", 67, Gender.MALE),
                Driver("Mary", 54, Gender.FEMALE)
            )
        )
        // Assert the oldest age in the list
        assertEquals(67, driversController.oldestDriverAge)
        // Assert the youngest age in the list
        assertEquals(34, driversController.youngestDriverAge)
        // Assert the first oldest drivers in the list
        assertEquals("Paul", driversController.oldestDrivers.firstOrNull()?.name)
        // Assert all the youngest drivers in the list
        assertContentEquals(listOf("Paul"), driversController.getOldestDriversName())
        // Assert the first youngest driver in the list
        assertEquals("John", driversController.youngestDrivers.firstOrNull()?.name)
        // Assert all the youngest drivers in the list
        assertContentEquals(listOf("John", "Claudio"), driversController.getYoungestDriversName())
        // Assert the remaining drivers
        assertContentEquals(
            listOf("Mary"),
            driversController.getDriversName(driversController.drivers)
                - driversController.getDriversName(driversController.oldestDrivers)
                - driversController.getDriversName(driversController.youngestDrivers)
        )
    }

    @Test
    fun `Driver information using a list of names and age pairs`() {
        val driversInfo = listOf("John" to 34, "Claudio" to 34, "Paul" to 67, "Mary" to 54)

        val oldestDriver = driversInfo.maxByOrNull { it.second }
        // Assert the oldest age in the list
        assertEquals(67, oldestDriver?.second)
        val youngestDriver = driversInfo.minByOrNull { it.second }
        // Assert the youngest age in the list
        assertEquals(34, youngestDriver?.second)

        val oldestDrivers = driversInfo.filter {
            it.second == oldestDriver?.second
        }.map { it.first }
        // Assert the first oldest drivers in the list
        assertEquals("Paul", oldestDriver?.first)
        // or
        assertEquals("Paul", oldestDrivers.first())
        // Assert all the youngest drivers in the list
        assertContentEquals(listOf("Paul"), oldestDrivers)

        val youngestDrivers = driversInfo.filter {
            it.second == youngestDriver?.second
        }.map { it.first }
        // Assert the first youngest driver in the list
        assertEquals("John", youngestDriver?.first)
        // or
        assertEquals("John", youngestDrivers.first())
        // Assert all the youngest drivers in the list
        assertContentEquals(listOf("John", "Claudio"), youngestDrivers)

        // Assert the remaining drivers
        assertContentEquals(listOf("Mary"), driversInfo.map { it.first }
            - oldestDrivers - youngestDrivers)
    }
}
