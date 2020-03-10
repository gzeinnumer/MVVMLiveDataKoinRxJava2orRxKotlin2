package com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2

import android.app.Application
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.koin.networkModule
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.koin.repositoryModule
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.koin.roomModule
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.koin.viewModelModule
import org.koin.android.ext.android.startKoin

//todo 2
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Start Koin
        //todo 12
        startKoin(this, listOf(
            networkModule,
            repositoryModule,
            viewModelModule,
            roomModule
        ))
        //end todo 12
    }
}