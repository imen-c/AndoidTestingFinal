package com.example.androidtestingfinal.data

import android.app.Application
import android.os.Parcel
import android.os.Parcelable
import com.example.androidtestingfinal.domain.MyRepository

class MyRepositoryImpl(
    private val api: MyApi,
    private val appContext : Application
) : MyRepository{
    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }

}