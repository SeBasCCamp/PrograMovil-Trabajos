package com.example.asignacion3.Pantallas.use_case

import com.example.asignacion3.Pantallas.model.Equipo
import com.example.asignacion3.Pantallas.Result
import com.example.asignacion3.Pantallas.repositories.EquipoRepository
import javax.inject.Inject

class GetEquipoUseCase @Inject constructor(
    private val repository: EquipoRepository
){

    suspend operator fun invoke(id: Int): Result<Equipo>{
        return repository.getEquipo(id)
    }
}