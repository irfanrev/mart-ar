package com.irfanrev.martar.utils

import android.net.Uri

sealed class Screen(val route: String) {
    object Product : Screen("product")
    object ProductDetail : Screen("product_detail/{productId}/{title}/{price}/{arUrl}/{image}") {
        fun passData(productId: String, title: String, price: Int, arUrl: String, image: String): String {
            // Properly encode the arguments to handle spaces or special characters
            val encodedTitle = Uri.encode(title)
            val encodedArUrl = Uri.encode(arUrl)
            val encodedImage = Uri.encode(image)
            return "product_detail/$productId/$encodedTitle/$price/$encodedArUrl/$encodedImage"
        }
    }
}
