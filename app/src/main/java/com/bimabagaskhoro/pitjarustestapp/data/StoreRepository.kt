package com.bimabagaskhoro.pitjarustestapp.data

import android.content.ContentValues.TAG
import android.util.Log
import com.bimabagaskhoro.pitjarustestapp.data.remote.RemoteDataSource
import com.bimabagaskhoro.pitjarustestapp.data.remote.network.ApiResponse
import com.bimabagaskhoro.pitjarustestapp.domain.model.Stores
import com.bimabagaskhoro.pitjarustestapp.domain.repository.IStoresRepository
import com.bimabagaskhoro.pitjarustestapp.utils.MappingHelper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class StoreRepository @Inject constructor(private val remoteDataSource: RemoteDataSource): IStoresRepository {
    override fun login(username: String, password: String): Flow<Resource<List<Stores>>> {
        return flow {
            emit(Resource.Loading(null))
            when (val apiResponse= remoteDataSource.login(username,password).first()){
                is ApiResponse.Success ->{
                    emit(Resource.Success(MappingHelper.entitiesToDomain(apiResponse.data!!)))
                }
                is ApiResponse.Error ->{
                    emit(Resource.Error(apiResponse.errorMessage!!))
                }
                is ApiResponse.Empty ->{
                    Log.d(TAG, "login: Empty Data")
                }
            }
        }
    }
}