package com.example.asignacion3.Pantallas.di

import com.example.asignacion3.Pantallas.data.repositories.TeamRepositoryImp
import com.example.asignacion3.Pantallas.domain.model.repositories.TeamRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindTeamRepository(impl: TeamRepositoryImp): TeamRepository
}