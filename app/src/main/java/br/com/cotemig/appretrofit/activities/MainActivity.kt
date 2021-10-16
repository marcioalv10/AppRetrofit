package br.com.cotemig.appretrofit.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.cotemig.appretrofit.R
import br.com.cotemig.appretrofit.model.ListaUsuario
import br.com.cotemig.appretrofit.services.RetrofitInitializer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        obterAmigos()
    }

    fun obterAmigos(){

        var s = RetrofitInitializer().serviceAmigo()

        var call = s.obterListaAmigos()

        call.enqueue(object : Callback<ListaUsuario>{
            override fun onResponse(call: Call<ListaUsuario>, response: Response<ListaUsuario>) {
                Toast.makeText(this@MainActivity, "Sucesso", Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(call: Call<ListaUsuario>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Ops", Toast.LENGTH_SHORT).show()
            }

        })

    }
}