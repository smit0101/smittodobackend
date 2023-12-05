package com.smittodobackend.route

import com.mongodb.client.model.Filters
import com.smittodobackend.data.taskCollection
import com.smittodobackend.model.Task
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Route.getAllTask(){
    get("/tasks"){
        call.respond(taskCollection.find().toList())
    }
}

fun Route.addTask(){
    post ("/addtask"){
        val task = call.receive<Task>()
        taskCollection.insertOne(task)
        call.respond(taskCollection.find().toList())
    }
}

fun Route.deleteTask(){
    delete ("/deletealltask"){
        taskCollection.deleteMany(Filters.exists("_id"))
        call.respond(taskCollection.find().toList())
    }
}