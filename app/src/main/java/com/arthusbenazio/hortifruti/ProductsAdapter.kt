package com.arthusbenazio.hortifruti

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductsAdapter (private val products: List<Products>) : RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageProduct: ImageView = itemView.findViewById(R.id.rvImageProduct)
        val nameTextView: TextView = itemView.findViewById(R.id.rvTextNome)
        val iconSearch: ImageView = itemView.findViewById(R.id.rvImageSearch)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.main_row_item, parent, false)
        return ProductViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val currentProduct = products[position]
        holder.imageProduct.setImageResource(currentProduct.imageStartID)
        holder.nameTextView.text = currentProduct.productName
        holder.iconSearch.setImageResource(currentProduct.imageEndID)
    }

    override fun getItemCount() = products.size
}
