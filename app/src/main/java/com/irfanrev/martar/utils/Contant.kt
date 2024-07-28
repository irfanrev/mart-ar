package com.irfanrev.martar.utils

import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey

object Constant {
    const val BASE_URL = "https://api.arvigo.site"
    const val AUTH_PREFERENCES = "AUTH_PREF"
    val ONBOARDING_KEY = booleanPreferencesKey("ONBOARDING_KEY")
    val AUTH_KEY = stringSetPreferencesKey("auth_key")
    val AUTH_ID = stringSetPreferencesKey("auth_id")
}