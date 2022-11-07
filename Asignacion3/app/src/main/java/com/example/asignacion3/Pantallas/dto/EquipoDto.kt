package com.example.asignacion3.Pantallas.dto

import com.example.asignacion3.Pantallas.model.Equipo

data class EquipoDto(
    val address: String,
    val area: Area,
    val clubColors: String,
    val coach: Coach,
    val crest: String,
    val founded: Int,
    val id: Int,
    val lastUpdated: String,
    val name: String,
    val runningCompetitions: List<RunningCompetition>,
    val shortName: String,
    val squad: List<Any>,
    val staff: List<Any>,
    val tla: String,
    val venue: String,
    val website: String
)

fun EquipoDto.toEquipo():Equipo {
    return Equipo(
        id = id,
        name = name,
        venue = venue,
        website = website,
        clubColors = clubColors,
        address = address,
        crest = crest
    )
}