package com.example.kotlincountries.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlincountries.model.Country
import com.example.kotlincountries.service.CountryDatabase
import kotlinx.coroutines.launch
import java.util.*

class CountryViewModel(application: Application) : BaseViewModel(application) {

    val countryLivaData = MutableLiveData<Country>()

    fun getDataFromRoom(uuid: Int){
        launch {

            val dao = CountryDatabase(getApplication()).countryDao()
            val country = dao.getCountry(uuid)
            countryLivaData.value = country
        }

    }

}