package com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network.handling.Resource
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network.handling.Status
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.R
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.network.model.MyResponse
import com.gzeinnumer.mvvmlivedatakoinrxjava2orrxkotlin2.ui.adapter.FoodAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    //Inject
    private val mainViewModel by inject<MainVM>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        with(mainViewModel) {
            getCategory().observe(this@MainActivity, Observer<Resource<MyResponse>> {
                when(it.status) {
                    Status.SHOWLOADING -> {
                        Log.d("Sukses", "Loading")
                    }

                    Status.SUCCESS -> {
                        val listData = it.data

                        val foodAdapter = listData?.categories?.let { it1 ->
                            FoodAdapter(it1) {

                            }
                        }
                        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
                        recyclerView.addItemDecoration(DividerItemDecoration(this@MainActivity, DividerItemDecoration.VERTICAL))
                        recyclerView.adapter = foodAdapter
                    }

                    Status.ERROR -> {
                        Log.d("Sukses", "Error")
                    }

                    Status.HIDELOADING -> {
                        Log.d("Sukses", "Hide")
                    }

                    else -> {
                        Log.d("Sukses", "Error")
                    }
                }
            })
        }

    }
}
