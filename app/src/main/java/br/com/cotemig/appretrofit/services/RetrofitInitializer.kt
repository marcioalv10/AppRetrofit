package br.com.cotemig.appretrofit.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory




class RetrofitInitializer {


    //Instalando o Retrofit para ser usado na URL
    //e Conversor JSON > Classe e Classe > JSON
    private val retrofit = Retrofit.Builder()
                    .baseUrl("")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

    //Criaando "Objeto" da interface ServiceAmigo para ser usado
    fun serviceAmigo(): ServiceAmigo {
        return retrofit.create(ServiceAmigo::class.java)
    }

}