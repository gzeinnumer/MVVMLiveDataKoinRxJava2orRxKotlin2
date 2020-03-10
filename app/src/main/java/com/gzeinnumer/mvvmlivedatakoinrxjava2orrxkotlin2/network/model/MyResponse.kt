package com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network.model

import com.google.gson.annotations.SerializedName

//todo 3
data class MyResponse(

	@field:SerializedName("categories")
	val categories: List<CategoriesItem>? = null
)