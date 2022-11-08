package com.example.asignacion3.Pantallas.data.source.remote

import com.example.asignacion3.Pantallas.data.source.remote.dto.TeamDto
import com.example.asignacion3.Pantallas.data.source.remote.dto.TeamsDto
import retrofit2.http.GET
import retrofit2.http.Path


interface EquiposAPI {
    @GET("competitions/WC/teams/{id}")
    suspend fun getTeams(
        @Path("id") id: Int
    ): TeamsDto

    @GET("team/{id}")
    suspend fun getTeam(
        @Path("id") id: Int
    ): TeamDto
}
