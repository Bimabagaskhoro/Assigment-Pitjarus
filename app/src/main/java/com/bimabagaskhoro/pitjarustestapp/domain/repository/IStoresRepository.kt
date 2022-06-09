package com.bimabagaskhoro.pitjarustestapp.domain.repository

import com.bimabagaskhoro.pitjarustestapp.data.Resource
import com.bimabagaskhoro.pitjarustestapp.domain.model.Stores
import kotlinx.coroutines.flow.Flow

interface IStoresRepository {

    fun login(username: String, password: String): Flow<Resource<List<Stores>>>

}