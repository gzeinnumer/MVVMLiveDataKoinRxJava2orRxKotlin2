package com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.koin

import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.ui.MainVM
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

//todo 11
val viewModelModule = module {
    viewModel { MainVM(get()) }
}