package com.dean.controller

import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TickController {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @GetMapping("/tick", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun tick(@RequestParam(defaultValue = "default") name: String): String {
        logger.info("##### tick! $name")
        return "tick! $name"
    }

}