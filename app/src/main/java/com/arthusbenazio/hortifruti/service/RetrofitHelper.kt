package com.arthusbenazio.hortifruti.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitHelper {
        companion object {

        val retrofit = Retrofit.Builder()
            .baseUrl("https://hortichoice.onrender.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }



}