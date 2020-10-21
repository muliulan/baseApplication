package com.example.baseapplication

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.base.network.ApiFactory
import kotlinx.coroutines.*

/**
 *author: zcs
 *date  : 2020/10/15
 *
 **/
class MainViewModel  :ViewModel(){

    private val mainApi: MainInterface = ApiFactory.retrofit().create( MainInterface::class.java)
    private val repository : MovieRepository =  MovieRepository(mainApi)

    private val scope = CoroutineScope(Job() + Dispatchers.Default)
//    protected var mViewModel: T? = null


    val popularMoviesLiveData = MutableLiveData<WeatherObj>()

    fun dd(){
        scope.launch {
            val popularMovies = repository.getPopularMovies()
            popularMoviesLiveData.postValue(popularMovies)
        }
        Log.e("mll","11")
        GlobalScope.launch {
            delay(100)
            Log.e("mll","22")

        }
        Log.e("mll","33")
    }

}