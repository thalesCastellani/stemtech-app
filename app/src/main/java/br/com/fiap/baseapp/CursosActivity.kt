package br.com.fiap.baseapp

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.baseapp.model.Curso
import com.android.volley.Request
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley

class CursosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cursos)

        val actionBar: ActionBar? = supportActionBar
        actionBar.let {
            actionBar?.setTitle("Cursos")
        }

        val baseUrl = "http://192.168.0.46:8081/curso"

        val requestQueue = Volley.newRequestQueue(this)

        val objectRequest = JsonArrayRequest(
            Request.Method.GET,
            baseUrl,
            null,
            { response ->
                val cursos = arrayListOf<Curso>()

                for (i in 0 until response.length()) {
                    val jsonObject = response.getJSONObject(i)
                    val id = jsonObject.getInt("id")
                    val nome = jsonObject.getString("nome")
                    val formacao = jsonObject.getString("formacao")
                    val categoria = jsonObject.getString("categoria")

                    val curso = Curso(
                        id = id.toString(),
                        nome = nome,
                        formacao = formacao,
                        categoria = categoria
                    )

                    cursos.add(curso)
                }
                val adapterString = ArrayAdapter(this, android.R.layout.simple_list_item_1, cursos)

                val lv_cursos = findViewById<ListView>(R.id.lv_cursos)
                lv_cursos.adapter = adapterString
            },
            { error ->
                Log.e("Error: ", error.toString())
            }
        )
        requestQueue.add(objectRequest)
    }
}



