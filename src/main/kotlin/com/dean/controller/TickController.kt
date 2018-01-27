package com.dean.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TickController {

    @GetMapping("/tick", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun tick(): String {
        return "tick!"
    }

}