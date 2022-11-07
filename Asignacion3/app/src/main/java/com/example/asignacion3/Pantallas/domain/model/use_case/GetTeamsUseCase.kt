package com.example.asignacion3.Pantallas.domain.model.use_case
import com.example.asignacion3.Pantallas.data.Result

import com.example.asignacion3.Pantallas.domain.model.repositories.TeamRepository
import kotlinx.coroutines.flow.Flow
import com.example.asignacion3.Pantallas.domain.model.Teams
import javax.inject.Inject
//No estoy seguro
class GetTeamsUseCase @Inject constructor(
    private val repository: TeamRepository
){
    operator fun invoke(id: Int): Flow<Result<List<Teams>>>{
        return repository.getTeams(id)
    }
}