package com.example.asignacion3.Pantallas.components

import com.example.asignacion3.Pantallas.domain.model.Teams

data class HomeState(
    val teams: List<Teams> = emptyList(),
    val showPrevious: Boolean = false,
    val showNext: Boolean = false,
    val isLoading: Boolean = false
)
