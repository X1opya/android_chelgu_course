package com.example.retrofit_example

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("films/{id}")
    suspend fun getFilm(@Path("id") id: String) : Response<Film>

    @GET("films")

    suspend fun getListFilms() : Response<List<Film>>


    companion object {
        const val API_URL = "https://ghibliapi.herokuapp.com/"

        fun instance() = Retrofit.Builder()
            .baseUrl(API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}