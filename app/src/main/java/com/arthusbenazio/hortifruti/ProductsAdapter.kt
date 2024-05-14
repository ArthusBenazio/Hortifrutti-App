package com.arthusbenazio.hortifruti

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arthusbenazio.hortifruti.Model.ProductData
import com.squareup.picasso.Picasso

class ProductsAdapter (private val products: List<ProductData>) : RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageProduct: ImageView = itemView.findViewById(R.id.rvImageProduct)
        val nameTextView: TextView = itemView.findViewById(R.id.rvTextNome)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.main_row_item, parent, false)
        return ProductViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val currentProduct = products[position]
        Picasso.get().load(currentProduct.productImage).into(holder.imageProduct)

        holder.nameTextView.text = currentProduct.name
    }

    override fun getItemCount() = products.size
}
