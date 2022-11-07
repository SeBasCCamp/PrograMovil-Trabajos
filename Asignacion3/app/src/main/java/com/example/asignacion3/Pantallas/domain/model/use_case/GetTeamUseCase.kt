package com.example.asignacion3.Pantallas.domain.model.use_case

import com.example.asignacion3.Pantallas.domain.model.Team
import com.example.asignacion3.Pantallas.domain.model.repositories.TeamRepository
import com.example.asignacion3.Pantallas.data.Result
import javax.inject.Inject

class GetTeamUseCase @Inject constructor(
    private val repository: TeamRepository
){

    suspend operator fun invoke(id: Int): Result<Team>{
        return repository.getTeam(id)
    }
}