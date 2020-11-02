package com.example.baseapplication

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.base.network.ApiFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

/**
 *author: zcs
 *date  : 2020/10/15
 *
 **/
class MainViewModel : ViewModel() {

    private val mainApi: MainInterface = ApiFactory.retrofit().create(MainInterface::class.java)
    private val repository: MovieRepository = MovieRepository(mainApi)

    private val scope = CoroutineScope(Job() + Dispatchers.Default)
//    protected var mViewModel: T? = null


    val popularMoviesLiveData = MutableLiveData<WeatherObj>()

    fun dd() {
        scope.launch {
            val popularMovies = repository.getPopularMovies()
            popularMoviesLiveData.postValue(popularMovies)
            val a = aa()
            Log.e("mll",a)
        }

    }

    //协程 挂起函数
    suspend fun aa() = suspendCoroutine<String> {
        it.resume("aaaaaaaa")
    }


}