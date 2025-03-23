package com.codewithfk.foodhub.di

import com.codewithfk.foodhub.data.SocketService
import com.codewithfk.foodhub.data.repository.LocationUpdateSocketRepository
import com.codewithfk.foodhub.location.LocationManager
import com.codewithfk.foodhub.ui.features.orders.LocationUpdateBaseRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object FlavorModule{
    @Provides
    fun provideLocationUpdateSocketRepository(
        socketService: SocketService,
        locationManager: LocationManager
    ): LocationUpdateBaseRepository {
        return LocationUpdateSocketRepository(socketService, locationManager)
    }
}