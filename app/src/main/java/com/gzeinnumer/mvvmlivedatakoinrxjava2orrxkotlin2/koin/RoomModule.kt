package com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.koin

import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.room.AppDatabase
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

val roomModule = module {
    single {
        AppDatabase()
    }
}