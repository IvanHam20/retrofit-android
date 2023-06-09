package com.example.retrofit_android.network

import com.example.retrofit_android.models.ImageRandom
import com.example.retrofit_android.models.ImagesBreed
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("breeds/image/random")
    fun imagenAleatoria(): Call<ImageRandom>

    @GET("breed/{raza}/images")
    fun listaImagenesDePerrosPorRaza
                (@Path("raza") raza: String) : Call<ImagesBreed>
}