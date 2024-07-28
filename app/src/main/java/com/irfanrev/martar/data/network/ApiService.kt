package com.irfanrev.martar.data.network

import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
//    @POST("/v1/auth/register-user")
//    fun register(
//        @Body request: RegisterRequest
//    ): Call<RegisterResponse>
//
//    @POST("/v1/auth/login")
//    fun login(
//        @Body request: LoginRequest
//    ): Call<LoginResponse>
//
//    @GET("/v1/questionnaires")
//    suspend fun getQuestionnaires(
//        @Header("Authorization") token: String,
//    ): Personality
//
//    @GET("/v1/homes")
//    suspend fun getHomeProduct(
//        @Header("Authorization") token: String,
//    ): HomeProduct
//
//    @GET("/v1/brands")
//    suspend fun getBrands(
//        @Header("Authorization") token: String,
//    ): BrandResponse
//
//    @GET("/v1/categories/1/list-product")
//    suspend fun getEyewearCategory(
//        @Header("Authorization") token: String,
//    ): CategoryResponse
//
//    @GET("/v1/homes/search/{search}")
//    suspend fun searchProduct(
//        @Header("Authorization") token: String,
//        @Path("search") search: String,
//    ): CategoryResponse
//
//    @GET("/v1/homes/merchant")
//    suspend fun getStores(
//        @Header("Authorization") token: String,
//    ): StoreResponse
//
//    @GET("/v1/categories/2/list-product")
//    suspend fun getMakeupCategory(
//        @Header("Authorization") token: String,
//    ): CategoryResponse
//
//    @POST("/v1/questionnaires")
//    suspend fun postQuestionnaire(
//        @Header("Authorization") token: String,
//        @Body request: QuestionnaireRequestX
//    ): QuestionnaireResponse
//
//    @GET("/v1/wishlists")
//    suspend fun getWishLists(
//        @Header("Authorization") token: String,
//    ): WishListsResponse
//
//    @GET("/v1/users/{userId}")
//    suspend fun getProfile(
//        @Header("Authorization") token: String,
//        @Path("userId") userId: String
//    ): ProfileResponse
//
//    @POST("/v1/auth/update-user/{userId}")
//    suspend fun editProfile(
//        @Header("Authorization") token: String,
//        @Path("userId") userId: String,
//        @Body request: RegisterRequest
//    ): RegisterResponse
//
//    @GET("/v1/products/initials/{id}")
//    suspend fun getProductDetail(
//        @Header("Authorization") token: String,
//        @Path("id") id: String
//    ): ProductDetailResponse
//
//    @GET("/v1/products/initials/{id}")
//    suspend fun getProductStore(
//        @Header("Authorization") token: String,
//        @Path("id") id: String
//    ): ProductDetailResponse
//
//    @GET("/v1/brands/{id}/list-product")
//    suspend fun getBrandDetail(
//        @Header("Authorization") token: String,
//        @Path("id") id: String
//    ): CategoryResponse
//
//    @POST("/v1/wishlists")
//    suspend fun addToWishlist(
//        @Header("Authorization") token: String,
//        @Body request: WishlisthProductRequest
//    ): Call<AddWishlistResponse>
//
//    @POST("/v1/wishlists")
//    suspend fun addToWishlistStore(
//        @Header("Authorization") token: String,
//        @Body request: WishlistStoreRequest
//    ): Call<AddWishlistResponse>
//
//    @HTTP(method = "DELETE", path = "/v1/wishlists", hasBody = true)
//    suspend fun deleteToWishlist(
//        @Header("Authorization") token: String,
//        @Body request: WishlisthProductRequest
//    ): Call<AddWishlistResponse>
//
//    @HTTP(method = "DELETE", path = "/v1/wishlists", hasBody = true)
//    suspend fun deleteToWishlistStore(
//        @Header("Authorization") token: String,
//        @Body request: WishlistStoreRequest
//    ): Call<AddWishlistResponse>
//
//    @Multipart
//    @POST("/v1/face-shape/check")
//    suspend fun submitFaceShape(
//        @Header("Authorization") token: String,
//        @Part image: MultipartBody.Part,
//    ): FaceshapeResponse
//
//    @GET("/v1/products/initials/marketplace/{id}")
//    suspend fun getOfferDetail(
//        @Header("Authorization") token: String,
//        @Path("id") id: String
//    ): OfferResponse
//
//    @POST("/v1/subscription/user")
//    fun addSubscription(
//        @Header("Authorization") token: String,
//        @Body request: SubscriptionRequest
//    ): Call<SubscriptionResponse>
}