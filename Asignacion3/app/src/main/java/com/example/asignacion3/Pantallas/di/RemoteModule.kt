package com.example.asignacion3.Pantallas.di

import com.example.asignacion3.Pantallas.data.source.remote.EquiposAPI
import com.example.asignacion3.Pantallas.util.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {

    @Provides
    @Singleton
    fun EquiposAPI(): EquiposAPI {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(EquiposAPI::class.java)
    }
}