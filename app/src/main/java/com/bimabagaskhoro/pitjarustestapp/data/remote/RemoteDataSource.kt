package com.bimabagaskhoro.pitjarustestapp.data.remote

import android.util.Log
import com.bimabagaskhoro.pitjarustestapp.data.remote.network.ApiResponse
import com.bimabagaskhoro.pitjarustestapp.data.remote.network.ApiService
import com.bimabagaskhoro.pitjarustestapp.data.remote.response.StoresItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val apiService: ApiService) {
    private val TAG = RemoteDataSource::class.java.simpleName

    suspend fun login(username : String, password: String): Flow<ApiResponse<List<StoresItem>>> {

        return flow {
            try {
                val response = apiService.login(username,password)
                val data = response.stores
                emit(ApiResponse.Success(data))
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.message.toString()))
                Log.d(TAG, "getAllPengguna: ${e.message}")
            }
        }.flowOn(Dispatchers.IO)
    }
}