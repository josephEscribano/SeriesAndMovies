package com.example.seriesandpelisjoseph.utils

sealed class NetworkResult<T>(
    val data:T? = null,
    val message: String? = null,
){
    class Succcess<T>(data: T): NetworkResult<T>(data)

    class Error<T>(message: String,data: T? = null) : NetworkResult<T>(data,message)
}
