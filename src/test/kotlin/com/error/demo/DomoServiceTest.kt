package com.error.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DomoServiceTest {

    @Autowired
    lateinit var demoService: DomoService

    @Test
    fun error() {₩
        demoService.demo()
    }
}