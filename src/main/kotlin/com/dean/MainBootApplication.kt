package com.dean

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


fun main(args: Array<String>) {

    SpringApplication.run(MainBootApplication::class.java, *args)
}


@SpringBootApplication
class MainBootApplication {

}