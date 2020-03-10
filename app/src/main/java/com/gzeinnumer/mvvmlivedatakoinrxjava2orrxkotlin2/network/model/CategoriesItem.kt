package com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

//todo 4
@Entity(tableName = "CategoriesItem")
data class CategoriesItem(

	@field:SerializedName("idCategory")
	@PrimaryKey(autoGenerate = true)
	val idCategory: String? = null,

	@field:SerializedName("strCategory")
	val strCategory: String? = null,

	@field:SerializedName("strCategoryDescription")
	val strCategoryDescription: String? = null,

	@field:SerializedName("strCategoryThumb")
	val strCategoryThumb: String? = null
)