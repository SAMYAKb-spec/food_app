package com.codewithfk.foodhub.data.models

import kotlinx.serialization.Serializable

@Serializable
data class FinalDestination(
    val address: String,
    val latitude: Double,
    val longitude: Double
)