package com.codewithfk.foodhub.data

import com.codewithfk.foodhub.data.models.AddToCartRequest
import com.codewithfk.foodhub.data.models.AddToCartResponse
import com.codewithfk.foodhub.data.models.Address
import com.codewithfk.foodhub.data.models.AddressListResponse
import com.codewithfk.foodhub.data.models.AuthResponse
import com.codewithfk.foodhub.data.models.CartResponse
import com.codewithfk.foodhub.data.models.CategoriesResponse
import com.codewithfk.foodhub.data.models.ConfirmPaymentRequest
import com.codewithfk.foodhub.data.models.ConfirmPaymentResponse
import com.codewithfk.foodhub.data.models.FoodItemResponse
import com.codewithfk.foodhub.data.models.GenericMsgResponse
import com.codewithfk.foodhub.data.models.OAuthRequest
import com.codewithfk.foodhub.data.models.PaymentIntentRequest
import com.codewithfk.foodhub.data.models.PaymentIntentResponse
import com.codewithfk.foodhub.data.models.ResturauntsResponse
import com.codewithfk.foodhub.data.models.ReverseGeoCodeRequest
import com.codewithfk.foodhub.data.models.SignInRequest
import com.codewithfk.foodhub.data.models.SignUpRequest
import com.codewithfk.foodhub.data.models.UpdateCartItemRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface FoodApi {
    @GET("/categories")
    suspend fun getCategories(): Response<CategoriesResponse>

    @GET("/restaurants")
    suspend fun getRestaurants(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double
    ): Response<ResturauntsResponse>

    @POST("/auth/signup")
    suspend fun signUp(@Body request: SignUpRequest): Response<AuthResponse>

    @POST("/auth/login")
    suspend fun signIn(@Body request: SignInRequest): Response<AuthResponse>

    @POST("/auth/oauth")
    suspend fun oAuth(@Body request: OAuthRequest): Response<AuthResponse>

    @GET("/restaurants/{restaurantId}/menu")
    suspend fun getFoodItemForRestaurant(@Path("restaurantId") restaurantId: String): Response<FoodItemResponse>

    @POST("/cart")
    suspend fun addToCart(@Body request: AddToCartRequest): Response<AddToCartResponse>

    @GET("/cart")
    suspend fun getCart(): Response<CartResponse>

    @PATCH("/cart")
    suspend fun updateCart(@Body request: UpdateCartItemRequest): Response<GenericMsgResponse>

    @DELETE("/cart/{cartItemId}")
    suspend fun deleteCartItem(@Path("cartItemId") cartItemId: String): Response<GenericMsgResponse>

    @GET("/addresses")
    suspend fun getUserAddress(): Response<AddressListResponse>

    @POST("/addresses/reverse-geocode")
    suspend fun reverseGeocode(@Body request: ReverseGeoCodeRequest): Response<Address>

    @POST("/addresses")
    suspend fun storeAddress(@Body address: Address): Response<GenericMsgResponse>

    @POST("/payments/create-intent")
    suspend fun getPaymentIntent(@Body request: PaymentIntentRequest): Response<PaymentIntentResponse>

    @POST("/payments/confirm/{paymentIntentId}")
    suspend fun verifyPurchase(
        @Body request: ConfirmPaymentRequest,
        @Path("paymentIntentId") paymentIntentId: String
    ): Response<ConfirmPaymentResponse>
}