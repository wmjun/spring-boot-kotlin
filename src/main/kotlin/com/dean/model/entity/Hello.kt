package com.dean.model.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by wmjun on 2018. 6. 26..
 */
@Entity
data class Hello(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val helloId: Long,
        val country: String,
        val content: String,
        val createdAt: Date = Date(),
        val updatedAt: Date = Date()
)