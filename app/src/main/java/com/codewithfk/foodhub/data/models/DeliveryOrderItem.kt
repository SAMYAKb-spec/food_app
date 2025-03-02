package com.codewithfk.foodhub.data.models

data class DeliveryOrderItem(
    val id: String,
    val name: String,
    val price: Double,
    val quantity: Int
)