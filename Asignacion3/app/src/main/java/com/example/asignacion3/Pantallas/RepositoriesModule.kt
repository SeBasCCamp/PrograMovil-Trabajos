package com.example.asignacion3.Pantallas

import com.example.asignacion3.Pantallas.repositories.EquipoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindEquipoRepository(impl: EquipoRepositoryImpl) : EquipoRepository
}