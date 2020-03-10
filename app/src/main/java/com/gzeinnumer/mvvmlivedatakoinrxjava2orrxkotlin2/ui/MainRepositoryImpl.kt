package com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.ui

import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network.ApiService
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network.model.MyResponse
import io.reactivex.Single

//todo 8
class MainRepositoryImpl(private val apiInterface: ApiService) : MainRepository {
    override fun getCategories(): Single<MyResponse> {
        return apiInterface.categories()
    }
}