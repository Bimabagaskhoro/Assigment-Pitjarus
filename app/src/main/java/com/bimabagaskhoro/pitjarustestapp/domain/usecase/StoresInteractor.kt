package com.bimabagaskhoro.pitjarustestapp.domain.usecase

import com.bimabagaskhoro.pitjarustestapp.data.Resource
import com.bimabagaskhoro.pitjarustestapp.domain.model.Stores
import com.bimabagaskhoro.pitjarustestapp.domain.repository.IStoresRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class StoresInteractor @Inject constructor(private val storesRepository: IStoresRepository) : StoresUseCase {

    override fun login(username: String, password: String): Flow<Resource<List<Stores>>> = storesRepository.login(username, password)

}