package com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.ui

import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network.model.MyResponse
import io.reactivex.Single

//todo 7
interface MainRepository {
    fun getCategories(): Single<MyResponse>
}