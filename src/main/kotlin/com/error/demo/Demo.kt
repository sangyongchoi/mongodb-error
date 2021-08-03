package com.error.demo

import org.springframework.data.mongodb.core.geo.GeoJsonPoint
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Demo(
    val location: GeoJsonPoint
)