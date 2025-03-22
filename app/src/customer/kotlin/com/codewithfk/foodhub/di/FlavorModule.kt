package com.codewithfk.foodhub.di

import com.codewithfk.foodhub.data.SocketService
import com.codewithfk.foodhub.data.repository.CustomerLocationUpdateSocketRepository
import com.codewithfk.foodhub.ui.features.orders.LocationUpdateBaseRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object FlavorModule {
    @Provides
    fun provideLocationUpdateSocketRepository(
        socketService: SocketService,
    ): LocationUpdateBaseRepository {
        return CustomerLocationUpdateSocketRepository(socketService)
    }
}

