package com.example.baseapplication

import com.example.base.network.BaseRepository

/**
 *author: zcs
 *date  : 2020/10/15
 *
 **/
class MovieRepository(private val api :  MainInterface) : BaseRepository() {

    suspend fun getPopularMovies(): WeatherObj?{
        return safeApiCall(
            call = { api.getPopularMovieAsync().await() },
            errorMessage = "Error Fetching Popular Movies"
        )

    }

}