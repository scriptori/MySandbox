package me.scriptori

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStreamWriter
import java.nio.file.Paths
import me.scriptori.model.Driver

class DriverController(var drivers: List<Driver>) {
    val oldestDriverAge = drivers.maxByOrNull { it.age }?.age
    val youngestDriverAge = drivers.minByOrNull { it.age }?.age
    val oldestDrivers: List<Driver> = drivers.filter { d ->
        d.age == oldestDriverAge
    }
    val youngestDrivers: List<Driver> = drivers.filter { d ->
        d.age == youngestDriverAge
    }

    fun getOldestDriversName(): List<String> {
        return oldestDrivers.map { it.name }
    }

    fun getYoungestDriversName(): List<String> {
        return youngestDrivers.map { it.name }
    }

    fun getDriversName(list: List<Driver>): List<String> {
        return list.map { it.name }
    }
}
