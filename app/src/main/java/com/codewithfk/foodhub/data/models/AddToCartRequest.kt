package com.codewithfk.foodhub.data.models

data class AddToCartRequest(
    val restaurantId: String,
    val menuItemId: String,
    val quantity: Int
)
