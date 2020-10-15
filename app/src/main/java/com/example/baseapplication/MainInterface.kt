package com.example.baseapplication

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface MainInterface {
//    @get:GET("get")
//    val call: Observable<WeatherObj?>?
//
//    @get:GET("get")
//    val ca: Call<WeatherObj?>

    @GET("get")
    fun getPopularMovieAsync(): Deferred<Response<WeatherObj>>


}