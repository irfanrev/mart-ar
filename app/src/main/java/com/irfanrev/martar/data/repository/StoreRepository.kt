package com.irfanrev.martar.data.repository

import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.irfanrev.martar.data.StoreModel
import kotlinx.coroutines.tasks.await

class StoreRepository {

    private val firebaseFirestore = FirebaseFirestore.getInstance()

    suspend fun getStores(): List<StoreModel> {
        return try {
            val result = firebaseFirestore.collection("products")
                .get()
                .await()
            Log.i("neo-info-result", result.toString())
            result.documents.map { it.toObject(StoreModel::class.java)!! }
        } catch (e: Exception) {
            emptyList()
        }
    }

}