package com.smittodobackend.data

import com.mongodb.ConnectionString
import com.smittodobackend.model.Task
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

//val kmongoClient = KMongo.createClient(ConnectionString("mongodb+srv://smit:9099850857@cluster0.srki2ok.mongodb.net/?retryWrites=true&w=majority")).coroutine
val kmongoClient = KMongo.createClient(ConnectionString("mongodb://mongodb:27017")).coroutine
val taskDatabase = kmongoClient.getDatabase("Tasks")
val taskCollection = taskDatabase.getCollection<Task>()
