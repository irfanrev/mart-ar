package com.irfanrev.martar.ui.features.store

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.irfanrev.martar.data.StoreModel
import com.irfanrev.martar.data.repository.StoreRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class StoreViewModel : ViewModel() {

    private val repository = StoreRepository()

    private val _stores = MutableStateFlow<List<StoreModel>>(emptyList())
    val stores: StateFlow<List<StoreModel>> = _stores

    init {
        fetchStores()
    }

    private fun fetchStores() {
        viewModelScope.launch {
            val fetchedStores = repository.getStores()
            Log.i("neo-info", fetchedStores.toString())
            _stores.value = fetchedStores
        }
    }

}