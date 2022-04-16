package com.example.beelineuzbekistan.model

data class BeelineProductModel(
    val title : String,
    val aboutTitle : String,
    val productImg : List<ProductImage>
)

data class ProductImage(
    val img : Int
)
