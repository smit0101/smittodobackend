package com.smittodobackend.data

import com.mongodb.ConnectionString
import com.smittodobackend.model.Task
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val kmongoClient = KMongo.createClient(ConnectionString("mongodb://mongo:27017")).coroutine
val taskDatabase = kmongoClient.getDatabase("Tasks")
val taskCollection = taskDatabase.getCollection<Task>()