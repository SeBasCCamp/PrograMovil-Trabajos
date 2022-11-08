package com.example.asignacion3.Pantallas.components

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.asignacion3.Pantallas.domain.model.use_case.GetTeamUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val getTeamUseCase: GetTeamUseCase,
    private val savedStateHandle: SavedStateHandle
): ViewModel() {

    var state by mutableStateOf(DetailState())
        private set

    init {
        getTeam()
    }

    private fun getTeam() {
        savedStateHandle.get<Int>("id")?.let { teamId ->
            viewModelScope.launch {
                getTeamUseCase(teamId).also { result ->
                    when (result) {
                        is com.example.asignacion3.Pantallas.data.Result.Success -> {
                            state = state.copy(
                                team = result.data,
                                isLoading = false
                            )
                        }
                        is com.example.asignacion3.Pantallas.data.Result.Error -> {
                            state = state.copy(
                                isLoading = false
                            )
                        }
                        is com.example.asignacion3.Pantallas.data.Result.Loading -> {
                            state = state.copy(
                                isLoading = true
                            )
                        }
                    }
                }
            }
        }
    }
}