package com.example.kotlincountries.service

import com.example.kotlincountries.model.Country
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.POST

interface CountryAPI {

    @GET("atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json")
    fun getCountries():Single<List<Country>>



}