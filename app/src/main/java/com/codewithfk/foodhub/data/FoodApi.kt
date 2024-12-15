package com.codewithfk.foodhub.data

import com.codewithfk.foodhub.data.models.AuthResponse
import com.codewithfk.foodhub.data.models.CategoriesResponse
import com.codewithfk.foodhub.data.models.OAuthRequest
import com.codewithfk.foodhub.data.models.SignInRequest
import com.codewithfk.foodhub.data.models.SignUpRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface FoodApi {
    @GET("/categories")
    suspend fun getCategories(): Response<CategoriesResponse>

    @POST("/auth/signup")
    suspend fun signUp(@Body request: SignUpRequest): Response<AuthResponse>

    @POST("/auth/login")
    suspend fun signIn(@Body request: SignInRequest): Response<AuthResponse>

    @POST("/auth/oauth")
    suspend fun oAuth(@Body request: OAuthRequest): Response<AuthResponse>
}