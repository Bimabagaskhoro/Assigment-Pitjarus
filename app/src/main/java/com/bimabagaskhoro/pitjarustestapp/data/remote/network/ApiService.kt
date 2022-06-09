package com.bimabagaskhoro.pitjarustestapp.data.remote.network

import com.bimabagaskhoro.pitjarustestapp.data.remote.response.ResponseLogin
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @POST("login/loginTest")
    suspend fun login(
        @Field("username") username: String,
        @Field("password") password: String
    ): ResponseLogin
}