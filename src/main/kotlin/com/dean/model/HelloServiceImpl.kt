package com.dean.model

import com.dean.model.entity.Hello
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by wmjun on 2018. 6. 27..
 */
@Service
class HelloServiceImpl : HelloService {

    @Autowired
    private lateinit var helloRepository: HelloRepository

    override fun getById(id: Long): Hello? {
        return helloRepository.findOne(id)
    }

}
