package com.dean.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 * Created By dean on 17. 06. 2018.
 */
@Controller
class PageController {

    @GetMapping("/main")
    fun mainPage(): String {
        return "index"
    }
}