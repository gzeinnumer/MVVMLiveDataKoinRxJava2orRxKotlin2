package com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.koin

import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.ui.MainRepository
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.ui.MainRepositoryImpl
import org.koin.dsl.module.module


//todo 9
val repositoryModule = module {
    single<MainRepository> { MainRepositoryImpl(get()) }
}