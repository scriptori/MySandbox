package me.scriptori.test

import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import me.scriptori.DriverController
import me.scriptori.model.Driver
import me.scriptori.model.Gender
import me.scriptori.util.JsonUtil

class DriverTest {
    class TestDrivers(val drivers: List<Driver>)

    @Test
    fun `Driver information using a list of Driver from json file`() {
        val jsonFile = File("src/test/resources/assets/drivers.json")
        assert(jsonFile.exists())
        val ds = JsonUtil.fromJsonFile(jsonFile, TestDrivers::class.java).drivers
        assert(ds.isNotEmpty())
        val driversController = DriverController(ds)
        verifyDriverData(driversController)
    }

    @Test
    fun `Driver information using a list of Driver from object model`() {
        val driversController = DriverController(
            listOf(
                Driver("John", 34, Gender.MALE),
                Driver("Claudio", 34, Gender.MALE),
                Driver("Paul", 67, Gender.MALE),
                Driver("Mary", 54, Gender.FEMALE)
            )
        )
        verifyDriverData(driversController)
    }

    @Test
    fun `Driver information using a list Driver from json string`() {
        val jsonStr = "{\"drivers\": [{\"name\": \"John\",\"age\": 34,\"gender\": \"MALE\" }," +
            "{\"name\": \"Claudio\",\"age\": 34,\"gender\": \"MALE\" }," +
            "{\"name\": \"Paul\",\"age\": 67,\"gender\": \"MALE\" }," +
            "{\"name\": \"Mary\",\"age\": 54,\"gender\": \"FEMALE\" }] }"
        val ds = JsonUtil.fromJsonString(jsonStr, TestDrivers::class.java).drivers
        val driversController = DriverController(ds)
        verifyDriverData(driversController)
    }

    private fun verifyDriverData(driversController: DriverController) {
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
}
