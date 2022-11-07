package com.example.asignacion3.Pantallas

import com.example.asignacion3.Pantallas.dto.EquipoDto
import com.example.asignacion3.Pantallas.dto.EquiposDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface EquiposApi {
    @GET("teams/")
    suspend fun getEquipos(
        //No estoy seguro
        @Query("page") page: Int
    ): EquiposDto

    @GET("equipo/{id}")
    suspend fun getEquipo(
        @Path("id") id: Int
    ): EquipoDto
}