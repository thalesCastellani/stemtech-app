package br.com.fiap.baseapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

class CursosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cursos)

        val actionBar: ActionBar? = supportActionBar
        actionBar.let {
            actionBar?.setTitle("Cursos")
        }

        val txvIdCurso = findViewById<TextView>(R.id.tv_id_curso)
        val txvNomeCurso = findViewById<TextView>(R.id.tv_nome_curso)
        val txvFormacaoCurso = findViewById<TextView>(R.id.tv_formacao_curso)
        val txvCategoriaCurso = findViewById<TextView>(R.id.tv_categoria_curso)

        var id = ""
        var nome = ""
        var formacao = ""
        var categoria = ""

        val BASE_URL = "https://192.168.0.46:8081/curso"

        val requestQueue = Volley.newRequestQueue(this)

        val objectRequest = JsonObjectRequest(
            Request.Method.GET,
            BASE_URL,
            null,
            Response.Listener { response ->
                Log.e("Response: ", response.toString())

                id = (response["id"] as Number).toString()
                nome = response["nome"] as String
                formacao = response["formacao"] as String
                categoria = response["categoria"] as String
            },
            Response.ErrorListener { error ->
                Log.e("Error: ", error.toString())
            }


/*            {
                Log.e("Rest response", it.toString())

                id = (it["id"] as Number).toString()
                nome = it["nome"] as String
                formacao = it["formacao"] as String
                categoria = it["categoria"] as String
            },
            {
                Log.e("Rest response", it.toString())
            }*/
        )

/*        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, BASE_URL, null,
            Response.Listener { response ->
                Log.e("Response: ", response.toString()))
            },
            Response.ErrorListener { error ->
                Log.e("Error: ", it.toString()))
            }
        )*/

        requestQueue.add(objectRequest)

        txvIdCurso.text = id
        txvNomeCurso.text = nome
        txvFormacaoCurso.text = formacao
        txvCategoriaCurso.text = categoria
    }
}