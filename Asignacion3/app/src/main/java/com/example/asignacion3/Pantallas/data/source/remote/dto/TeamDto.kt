package com.example.asignacion3.Pantallas.data.source.remote.dto
import com.example.asignacion3.Pantallas.domain.model.Team

data class TeamDto(
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

fun TeamDto.toTeam(): Team {
    return Team(
        id=id,
        name=name,
        clubColors = clubColors,
        crest = crest,
        venue = venue,
        website = website,
        address = address
    )
}