package com.smittodobackend.plugins


import com.smittodobackend.route.addTask
import com.smittodobackend.route.deleteTask
import com.smittodobackend.route.getAllTask
import com.smittodobackend.route.testTest
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        addTask()
        getAllTask()
        deleteTask()
        testTest()
    }
}
