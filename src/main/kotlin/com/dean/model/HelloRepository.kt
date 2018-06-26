package com.dean.model

import com.dean.model.entity.Hello
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by wmjun on 2018. 6. 26..
 */
@Repository
interface HelloRepository : JpaRepository<Hello, Long> {
}