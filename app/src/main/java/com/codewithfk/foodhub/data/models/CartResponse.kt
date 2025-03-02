package com.codewithfk.foodhub.data.models

data class CartResponse(
    val checkoutDetails: CheckoutDetails,
    val items: List<CartItem>
)