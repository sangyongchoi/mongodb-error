package com.error.demo

import org.springframework.data.geo.Point
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.minDistance
import org.springframework.data.mongodb.core.query.nearSphere
import org.springframework.stereotype.Service

@Service
class DomoService(
    private val mongoOperations: MongoOperations
) {

    fun demo() {
        val query = Query()
            .addCriteria(Demo::location nearSphere Point(0.0, 0.0))
            .addCriteria(Demo::location minDistance 3.0)

        mongoOperations.find(
            query,
            Demo::class.java
        )
    }
}