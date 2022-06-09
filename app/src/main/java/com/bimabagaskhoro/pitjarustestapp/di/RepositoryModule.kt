package com.bimabagaskhoro.pitjarustestapp.di

import com.bimabagaskhoro.pitjarustestapp.data.StoreRepository
import com.bimabagaskhoro.pitjarustestapp.domain.repository.IStoresRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [NetworkModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun provideRepository(storeRepository: StoreRepository): IStoresRepository

}