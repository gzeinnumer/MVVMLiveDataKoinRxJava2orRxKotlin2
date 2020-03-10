package com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network.model.CategoriesItem
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.room.dao.CategoriesDao

@Database(entities = [CategoriesItem::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun categoriesDao() : CategoriesDao
}