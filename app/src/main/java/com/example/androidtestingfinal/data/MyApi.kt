package com.example.androidtestingfinal.data

import retrofit2.http.GET

interface MyApi {


    @GET("test")
    suspend fun doNetworkCall()
}