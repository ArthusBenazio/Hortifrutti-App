package com.arthusbenazio.hortifruti

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.arthusbenazio.hortifruti.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val products = listOf(
            Products(R.drawable.logo2, "Maracujá", R.drawable.ic_arrow_right_24),
            Products(R.drawable.uva, "Uva", R.drawable.ic_arrow_right_24),
            Products(R.drawable.morango, "Morango", R.drawable.ic_arrow_right_24),
            Products(R.drawable.melancia, "Melancia", R.drawable.ic_arrow_right_24),
            Products(R.drawable.abacaxi, "Abacaxi", R.drawable.ic_arrow_right_24),
            Products(R.drawable.logo2, "Maracujá", R.drawable.ic_arrow_right_24),
            Products(R.drawable.uva, "Uva", R.drawable.ic_arrow_right_24),
            Products(R.drawable.morango, "Morango", R.drawable.ic_arrow_right_24),
            Products(R.drawable.melancia, "Melancia", R.drawable.ic_arrow_right_24),
            Products(R.drawable.abacaxi, "Abacaxi", R.drawable.ic_arrow_right_24),
            Products(R.drawable.logo2, "Maracujá", R.drawable.ic_arrow_right_24),
            Products(R.drawable.uva, "Uva", R.drawable.ic_arrow_right_24),
            Products(R.drawable.morango, "Morango", R.drawable.ic_arrow_right_24),
            Products(R.drawable.melancia, "Melancia", R.drawable.ic_arrow_right_24),
            Products(R.drawable.abacaxi, "Abacaxi", R.drawable.ic_arrow_right_24),
            Products(R.drawable.logo2, "Maracujá", R.drawable.ic_arrow_right_24),
            Products(R.drawable.uva, "Uva", R.drawable.ic_arrow_right_24),
            Products(R.drawable.morango, "Morango", R.drawable.ic_arrow_right_24),
            Products(R.drawable.melancia, "Melancia", R.drawable.ic_arrow_right_24),
            Products(R.drawable.abacaxi, "Abacaxi", R.drawable.ic_arrow_right_24)
        )

        adapter = ProductsAdapter(products)
        binding.rvProducts.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        binding.rvProducts.layoutManager = layoutManager
    }
}