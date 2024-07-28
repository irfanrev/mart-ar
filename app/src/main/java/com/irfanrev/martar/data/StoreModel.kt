package com.irfanrev.martar.data


import com.google.gson.annotations.SerializedName

data class StoreModel(
    val id: String = "",
    val ar_url: String = "",
    val description: String = "",
    val id_store: String = "",
    val image: String = "",
    val name: String = "",
    val price: Int = 0,
    val size: String = ""
)