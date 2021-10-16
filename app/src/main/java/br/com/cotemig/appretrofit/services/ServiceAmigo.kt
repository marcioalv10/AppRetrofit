package br.com.cotemig.appretrofit.services

import br.com.cotemig.appretrofit.model.ListaUsuario
import retrofit2.Call
import retrofit2.http.GET

interface ServiceAmigo {

    @GET("amigos")
    fun obterListaAmigos() : Call <ListaUsuario>

}