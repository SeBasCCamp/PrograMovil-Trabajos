package com.example.asignacion3.Pantallas.use_case

import com.example.asignacion3.Pantallas.repositories.EquipoRepository
import kotlinx.coroutines.flow.Flow
import com.example.asignacion3.Pantallas.Result
import com.example.asignacion3.Pantallas.model.Equipos
import javax.inject.Inject
//No estoy seguro
class GetEquiposUseCase @Inject constructor(
    private val repository: EquipoRepository
){
    operator fun invoke(page: Int): Flow<Result<List<Equipos>>>{
        return repository.getEquipos(page)
    }
}