package com.example.asignacion3.Pantallas.data.source.remote.dto

import com.example.asignacion3.Pantallas.domain.model.Teams

data class TeamsDto(
    val competition: Competition,
    val count: Int,
    val filters: Filters,
    val season: Season,
    val teams: List<Team>
)

fun TeamsDto.toListTeams(): List<Teams>{
    val resultEntries = teams.mapIndexed { _, entries ->
        Teams(
            id = entries.id,
            name = entries.name,
            crest = entries.crest,
            founded = entries.founded
        )
    }
    return resultEntries
}