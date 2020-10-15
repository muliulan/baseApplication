package com.example.baseapplication

import com.example.base.network.BaseRepository

/**
 *author: zcs
 *date  : 2020/10/15
 *
 **/
class MovieRepository(private val api : com.example.baseapplication.MainInterface) : BaseRepository() {

    suspend fun getPopularMovies(): WeatherObj?{
        //safeApiCall is defined in BaseRepository.kt (https://gist.github.com/navi25/67176730f5595b3f1fb5095062a92f15)
        val movieResponse = safeApiCall(
            call = { api.getPopularMovieAsync().await() },
            errorMessage = "Error Fetching Popular Movies"
        )
        return movieResponse

    }

}