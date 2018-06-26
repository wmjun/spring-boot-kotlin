package com.dean.controller

import com.dean.model.HelloService
import com.dean.model.entity.Hello
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/hello")
@RestController
class HelloController {

    @Autowired
    private lateinit var helloService: HelloService

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @GetMapping("/{id}", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun helloOne(@PathVariable() id: Long): Hello {

        return helloService.getById(id) ?: Hello(0,"NOT_EXIST","NOT_EXIST")
    }

}