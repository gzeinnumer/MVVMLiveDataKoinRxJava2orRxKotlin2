package com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network.handling.Resource
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network.model.MyResponse
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers

//todo 10
class MainVM(private val mainRepository: MainRepository) : ViewModel() {
    fun getCategory(): LiveData<Resource<MyResponse>> {
        val list = MutableLiveData<Resource<MyResponse>>()

        mainRepository.getCategories()
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.io())
            .doOnSubscribe {
                list.value = Resource.showLoading(null)
            }
            .doFinally {
//                list.value = Resource.hideLoading(null)
            }
            .subscribeBy(
                onSuccess = {
                    list.postValue(Resource.success(it))
                },

                onError = {
                    list.postValue(Resource.error(it.message.toString(), null))
                }
            )

        return list
    }
}