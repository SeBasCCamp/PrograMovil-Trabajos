package com.example.asignacion3.Pantallas.dto

import com.example.asignacion3.Pantallas.model.Equipos

data class EquiposDto(
    val competition: Competition,
    val count: Int,
    val filters: Filters,
    val season: Season,
    val teams: List<Team>
)

fun EquiposDto.toListEquipos(): List<Equipos>{
    val resultEntries = teams.mapIndexed { _, entries ->
        Equipos(
            id = entries.id,
            name = entries.name,
            founded = entries.founded,
            crest = entries.crest
        )
    }
    return resultEntries
}