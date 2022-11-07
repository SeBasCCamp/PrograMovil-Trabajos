package com.example.asignacion3.Pantallas.repositories
import com.example.asignacion3.Pantallas.Result
import com.example.asignacion3.Pantallas.model.Equipo
import com.example.asignacion3.Pantallas.model.Equipos
import kotlinx.coroutines.flow.Flow


interface EquipoRepository {

    fun getEquipos(page: Int):Flow<Result<List<Equipos>>>

    suspend fun getEquipo(id: Int): Result<Equipo>
}