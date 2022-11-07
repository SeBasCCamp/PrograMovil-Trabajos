package com.example.asignacion3.Pantallas.data.repositories

import com.example.asignacion3.Pantallas.data.source.remote.EquiposAPI
import com.example.asignacion3.Pantallas.domain.model.Teams
import com.example.asignacion3.Pantallas.domain.model.repositories.TeamRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.lang.Exception
import javax.inject.Inject
import com.example.asignacion3.Pantallas.data.Result
import com.example.asignacion3.Pantallas.data.source.remote.dto.toListTeams
import com.example.asignacion3.Pantallas.data.source.remote.dto.toTeam
import com.example.asignacion3.Pantallas.domain.model.Team


class TeamRepositoryImp @Inject constructor(
    private val api: EquiposAPI
): TeamRepository{
    override fun getTeams(id: Int): Flow<Result<List<Teams>>> = flow{
        emit(Result.Loading())
        try {
            val response = api.getTeams(id).toListTeams()
            emit(Result.Success(response))
        } catch (e: HttpException){
            emit(Result.Error(
                message = "naa",
                data = null
            ))
        } catch (e:IOException){
            emit(Result.Error(
                message = "noo",
                data = null
            ))
        }
    }

    override suspend fun getTeam(id: Int): Result<Team> {
        val response = try {
            api.getTeam(id)
        } catch (e: Exception) {
            return Result.Error("An unknown error occurred")
        }
        return Result.Success(response.toTeam())
    }


}