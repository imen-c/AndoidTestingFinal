package com.example.androidtestingfinal.di

import com.example.androidtestingfinal.data.MyApi
import com.example.androidtestingfinal.data.MyRepositoryImpl
import com.example.androidtestingfinal.domain.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class) // ServiceComponent,ActivityComponent ... duree de vie
object AppModule {


    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(api: MyApi) : MyRepository{    // Dagger va reconnaitre seul qui doit faire appel à provideMyapi pour avoir api sur la ligne 30
        return MyRepositoryImpl(api)
    }
}