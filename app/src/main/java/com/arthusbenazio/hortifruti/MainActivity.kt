package com.arthusbenazio.hortifruti

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.arthusbenazio.hortifruti.databinding.ActivityMainBinding
import com.arthusbenazio.hortifruti.service.ApiService
import com.arthusbenazio.hortifruti.service.RetrofitHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//class MainActivity : AppCompatActivity() {
//
//    private val binding by lazy {
//        ActivityMainBinding.inflate(layoutInflater)
//    }
//
//    private lateinit var adapter: ProductsAdapter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(binding.root)
//
//        val products = listOf(
//            Products(1, R.drawable.logo2, "Maracujá"),
//            Products(2, R.drawable.uva, "Uva"),
//            Products(3, R.drawable.morango, "Morango"),
//            Products(4, R.drawable.melancia, "Melancia"),
//            Products(5, R.drawable.abacaxi, "Abacaxi"),
//            Products(6, R.drawable.logo2, "Maracujá"),
//            Products(7, R.drawable.uva, "Uva"),
//            Products(8, R.drawable.morango, "Morango"),
//            Products(9, R.drawable.melancia, "Melancia"),
//            Products(10, R.drawable.abacaxi, "Abacaxi"),
//            Products(11, R.drawable.logo2, "Maracujá"),
//            Products(12, R.drawable.uva, "Uva"),
//            Products(13, R.drawable.morango, "Morango"),
//            Products(14, R.drawable.melancia, "Melancia"),
//            Products(15, R.drawable.abacaxi, "Abacaxi"),
//            Products(16, R.drawable.logo2, "Maracujá"),
//            Products(17, R.drawable.uva, "Uva"),
//            Products(18, R.drawable.morango, "Morango"),
//            Products(19, R.drawable.melancia, "Melancia"),
//            Products(20, R.drawable.abacaxi, "Abacaxi")
//        )
//
//        adapter = ProductsAdapter(products)
//        binding.rvProducts.adapter = adapter
//
//        val layoutManager = LinearLayoutManager(this)
//        binding.rvProducts.layoutManager = layoutManager
//    }
//}

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val layoutManager = LinearLayoutManager(this)
        binding.rvProducts.layoutManager = layoutManager

        // Initialize Retrofit
        val retrofit = RetrofitHelper.retrofit

        // Create the ApiService
        val apiService = retrofit.create(ApiService::class.java)

        // Fetch products using coroutines
        CoroutineScope(Dispatchers.IO).launch {
            val response = apiService.getProducts()

            if (response.isSuccessful) {
                val productData = response.body() ?: emptyList()
                adapter = ProductsAdapter(productData)
                binding.rvProducts.adapter = adapter
            } else {

            }
        }
    }
}