package com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network

import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network.model.MyResponse
import io.reactivex.Single
import retrofit2.http.GET


//todo 5
interface ApiService {
    @GET("categories.php")
    fun categories(): Single<MyResponse>
}