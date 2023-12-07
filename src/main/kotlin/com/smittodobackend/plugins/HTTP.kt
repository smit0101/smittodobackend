package com.smittodobackend.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.cors.routing.*
import io.ktor.server.plugins.defaultheaders.*
import io.ktor.server.plugins.httpsredirect.*

fun Application.configureHTTP() {
    install(CORS) {
        allowMethod(HttpMethod.Options)
        allowHeader(HttpHeaders.Authorization)
        allowHeader("MyCustomHeader")
        anyMethod()
        anyHeader()
        anyHost() // @TODO: Don't do this in production if possible. Try to limit it.
    }

}
