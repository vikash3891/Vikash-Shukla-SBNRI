package com.example.vikashshuklasbnri.model.api

import com.example.vikashshuklasbnri.model.Item
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.ArrayList

interface ApiService {

    @GET("repos")
    abstract fun getRepo(@Query("page") page: String, @Query("per_page") per_page: String): Call<ArrayList<Item>>

}