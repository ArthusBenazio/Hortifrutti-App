package com.arthusbenazio.hortifruti.Model

data class ProductData (
    val id: String,
    val productImage: String?,
    val name: String,
    val type: String,
    val protein: String?,
    val totalFats: String?,
    val colesterol: String?,
    val sodium: String?,
    val potassium: String?,
    val fibers: String,
    val sugar: String?,
    val calories: String,
    val iron: String?,
    val magnesium: String?,
    val calcium: String?,
    val carbohydrates: String?,
    val vitamins: List<String>,
    val nativeFrom: List<String>,
    val history: String,
    val howChoose: String,
    val howToUse: String
)





