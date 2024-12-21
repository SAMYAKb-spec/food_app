package com.codewithfk.foodhub.ui.navigation

import com.codewithfk.foodhub.data.models.FoodItem
import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object SignUp

@Serializable
object AuthScreen

@Serializable
object Home

@Serializable
data class RestaurantDetails(
    val restaurantId: String,
    val restaurantName: String,
    val restaurantImageUrl: String,
)

@Serializable
data class FoodDetails(val foodItem: FoodItem)