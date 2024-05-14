package com.arthusbenazio.hortifruti.service


import com.arthusbenazio.hortifruti.Model.ProductData
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("product")
    suspend fun getProducts(): Response<List<ProductData>>
}

