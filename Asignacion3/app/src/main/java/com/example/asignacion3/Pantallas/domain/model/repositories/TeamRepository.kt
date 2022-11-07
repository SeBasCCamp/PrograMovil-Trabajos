package com.example.asignacion3.Pantallas.domain.model.repositories
import com.example.asignacion3.Pantallas.domain.model.Team
import com.example.asignacion3.Pantallas.domain.model.Teams
import com.example.asignacion3.Pantallas.data.Result
import kotlinx.coroutines.flow.Flow


interface TeamRepository {

    fun getTeams(id: Int):Flow<Result<List<Teams>>>

    suspend fun getTeam(id: Int): Result<Team>
}