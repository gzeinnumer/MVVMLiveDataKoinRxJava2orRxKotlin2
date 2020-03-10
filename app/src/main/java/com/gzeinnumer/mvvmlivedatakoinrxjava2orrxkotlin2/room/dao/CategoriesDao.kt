package com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.room.dao

import androidx.room.*
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network.model.CategoriesItem
import io.reactivex.Completable
import io.reactivex.Observable

@Dao
interface CategoriesDao {
    @Insert
    fun insert(quote: CategoriesItem) : Completable

    @Update
    fun update(quote: CategoriesItem) : Completable

    @Delete
    fun delete(quote: CategoriesItem) : Completable

    @Query("DELETE FROM CategoriesItem")
    fun deleteAllCategories()

    @Query("SELECT * FROM CategoriesItem ORDER BY idCategory DESC")
    fun getAllCategories(): Observable<List<CategoriesItem>>
}