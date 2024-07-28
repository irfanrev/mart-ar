package com.irfanrev.martar.ui.features.store

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import com.irfanrev.martar.data.StoreModel
import com.irfanrev.martar.utils.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StoreScreen(navController: NavController) {
    val storeViewModel: StoreViewModel = viewModel()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Beauty Store") },

            )
        }
    ) { it
        BeautyStoreScreen(storeViewModel, navController)
    }
}


@Composable
fun BeautyStoreScreen(storeViewModel: StoreViewModel, navController: NavController) {
    val stores by storeViewModel.stores.collectAsState()

    Column(modifier = Modifier.fillMaxSize()) {
//        FilterSection()
        StoreList(stores, navController)
    }
}

@Composable
fun FilterSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "Sort By")
        }
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "Categories")
        }
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "Pickup")
        }
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "Offers")
        }
    }
}

@Composable
fun StoreList(stores: List<StoreModel>, navController: NavController) {
    Column (
        modifier = Modifier.padding(top = 44.dp)
    ) {
        stores.forEach { store ->
            StoreItem(store, navController)
        }
    }
}

@Composable
fun StoreItem(store: StoreModel, navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.White, RoundedCornerShape(8.dp))
            .padding(8.dp)
            .clickable {
                       navController.navigate(Screen.ProductDetail.passData(
                           store.id,
                           store.name,
                           store.price,
                           store.ar_url,
                           store.image
                       ))
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = rememberAsyncImagePainter(store.image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(86.dp)
                .clip(RoundedCornerShape(8.dp))
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = store.name,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
//            store.rating?.let {
//                Text(
//                    text = "⭐ ${store.rating} (${store.ratingCount}+) • ${store.deliveryTime} mins",
//                    fontSize = 14.sp,
//                    color = Color.Gray
//                )
//            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Rp${store.price} Rp${store.price}",
                
                fontSize = 14.sp,
                color = Color.Gray
            )
//            store.tags?.let {
//                Row {
//                    it.forEach { tag ->
//                        Box(
//                            modifier = Modifier
//                                .padding(end = 4.dp)
//                                .background(Color.LightGray, RoundedCornerShape(4.dp))
//                                .padding(4.dp)
//                        ) {
//                            Text(text = tag, fontSize = 12.sp)
//                        }
//                    }
//                }
//            }
        }
    }
}