package com.bimabagaskhoro.pitjarustestapp.di

import com.bimabagaskhoro.pitjarustestapp.domain.usecase.StoresInteractor
import com.bimabagaskhoro.pitjarustestapp.domain.usecase.StoresUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class AppModule {
    @Binds
    @ViewModelScoped
    abstract fun provideStoresUseCase(storesInteractor: StoresInteractor): StoresUseCase

}