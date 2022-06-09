package com.bimabagaskhoro.pitjarustestapp.domain.usecase

import com.bimabagaskhoro.pitjarustestapp.data.Resource
import com.bimabagaskhoro.pitjarustestapp.domain.model.Stores
import kotlinx.coroutines.flow.Flow

interface StoresUseCase {
    fun login(username: String, password: String): Flow<Resource<List<Stores>>>

}