package com.example.cleanarchitecturenoteapp.domain.util

sealed class OrderType{

    object Ascending : OrderType()
    object Descending : OrderType()
}
