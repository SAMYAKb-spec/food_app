package com.codewithfk.foodhub.ui.features.orders

import com.codewithfk.foodhub.data.SocketService

abstract class LocationUpdateBaseRepository (val socketService: SocketService)
{
    open val messages = socketService.messages
    abstract fun connect(orderID: String, riderID: String)
    abstract fun disconnect()
}