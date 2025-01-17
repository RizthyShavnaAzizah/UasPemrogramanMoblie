package com.logins.beritarizthy


import com.logins.beritarizthy.model.Berita
import retrofit2.Response
import retrofit2.http.GET

interface BeritaApi {
    @GET("berita.json")
    suspend fun getBeritas(): Response<List<Berita>>

}