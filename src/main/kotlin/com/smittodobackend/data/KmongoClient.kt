package com.smittodobackend.data

import com.mongodb.ConnectionString
import com.smittodobackend.model.Task
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val mongoHost = System.getenv("MONGODB_HOST") ?: "mongodb-service"
val mongoPort = 27017
val mongoDatabase = "Tasks" 

val kmongoClient = KMongo.createClient(ConnectionString("mongodb://$mongoHost:$mongoPort")).coroutine
val taskDatabase = kmongoClient.getDatabase(mongoDatabase)
val taskCollection = taskDatabase.getCollection<Task>()
