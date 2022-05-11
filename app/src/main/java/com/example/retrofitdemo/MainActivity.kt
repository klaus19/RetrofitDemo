package com.example.retrofitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quotesApi = RetrofitHelper.getinstance().create(QuotesApi::class.java)

        //launching a new coroutine

        GlobalScope.launch {

            val result = quotesApi.getQuotes()

            if(result!=null) {
                // Checking the results
                Log.d("ayush: ", result.body().toString())
            }
        }
    }
}