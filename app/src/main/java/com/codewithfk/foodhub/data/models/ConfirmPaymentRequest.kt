package com.codewithfk.foodhub.data.models

data class ConfirmPaymentRequest(
    val paymentIntentId: String,
    val addressId: String
)
