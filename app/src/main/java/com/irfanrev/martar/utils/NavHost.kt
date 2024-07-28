package com.irfanrev.martar.utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.irfanrev.martar.ui.features.product_detail.ProductDetailScreen
import com.irfanrev.martar.ui.features.store.StoreScreen
import com.ramcosta.composedestinations.utils.composable

@Composable
fun NavGraph(startDestination: String = Screen.Product.route) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screen.Product.route) {
            StoreScreen(navController)
        }
        composable(
            route = Screen.ProductDetail.route,
            arguments = listOf(
                navArgument("productId") { type = NavType.StringType },
                navArgument("title") { type = NavType.StringType },
                navArgument("price") { type = NavType.IntType },
                navArgument("arUrl") { type = NavType.StringType },
                navArgument("image") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId").orEmpty()
            val title = backStackEntry.arguments?.getString("title").orEmpty()
            val price = backStackEntry.arguments?.getInt("price") ?: 0
            val arUrl = backStackEntry.arguments?.getString("arUrl").orEmpty()
            val image = backStackEntry.arguments?.getString("image").orEmpty()
            ProductDetailScreen(
                navController,
                title,
                price.toString(),
                arUrl,
                image
            )
        }
    }
}
