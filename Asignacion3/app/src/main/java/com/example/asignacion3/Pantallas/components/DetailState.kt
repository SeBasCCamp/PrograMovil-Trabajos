package com.example.asignacion3.Pantallas.components

import com.example.asignacion3.Pantallas.domain.model.Team


data class DetailState(
    val team: Team? = null,
    val isLoading: Boolean = false
)