package com.dean.model

import com.dean.model.entity.Hello

/**
 * Created by wmjun on 2018. 6. 27..
 */
interface HelloService {
    fun getById(id: Long): Hello?
}