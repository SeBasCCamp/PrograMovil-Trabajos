package com.example.asignacion3.Pantallas

import com.example.asignacion3.Pantallas.dto.toEquipo
import com.example.asignacion3.Pantallas.dto.toListEquipos
import com.example.asignacion3.Pantallas.model.Equipo
import com.example.asignacion3.Pantallas.model.Equipos
import com.example.asignacion3.Pantallas.repositories.EquipoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class EquipoRepositoryImpl @Inject constructor(
    //No estoy seguro
    private val api: EquiposApi
): EquipoRepository{
    override fun getEquipos(page: Int): Flow<Result<List<Equipos>>> = flow{
        emit(Result.Loading())
        try {
            val response = api.getEquipos(page).toListEquipos()
            emit(Result.Success(response))
        }catch (e: HttpException){
            emit(Result.Error(
                message = "Salio mal saddd",
                data = null
            ))
        }catch (e: IOException){
            emit(Result.Error(
                message = "Necesitas internet",
                data = null
            ))
        }
    }

    override suspend fun getEquipo(id: Int): Result<Equipo> {
        val response = try{
            api.getEquipo(id)
        }catch (e: Exception){
            return Result.Error("Ocurrio un error")
        }
        return Result.Success(response.toEquipo())
    }


}