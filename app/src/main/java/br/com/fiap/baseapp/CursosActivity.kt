package br.com.fiap.baseapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
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

        val txvIdCurso = findViewById<TextView>(R.id.tv_id_curso)
        val txvNomeCurso = findViewById<TextView>(R.id.tv_nome_curso)
        val txvFormacaoCurso = findViewById<TextView>(R.id.tv_formacao_curso)
        val txvCategoriaCurso = findViewById<TextView>(R.id.tv_categoria_curso)

        val baseUrl = "http://192.168.0.46:8081/curso"

        val requestQueue = Volley.newRequestQueue(this)

        val objectRequest = JsonArrayRequest(
            Request.Method.GET,
            baseUrl,
            null,
            { response ->
                Log.e("Response: ", response.toString())

                for (i in 0 until response.length()) {
                    val jsonObject = response.getJSONObject(i)
                    val id = jsonObject.getInt("id")
                    val nome = jsonObject.getString("nome")
                    val formacao = jsonObject.getString("formacao")
                    val categoria = jsonObject.getString("categoria")

                    txvIdCurso.text = id.toString()
                    txvNomeCurso.text = nome
                    txvFormacaoCurso.text = formacao
                    txvCategoriaCurso.text = categoria
                }
            },
            { error ->
                Log.e("Error: ", error.toString())
            }
        )
        requestQueue.add(objectRequest)
    }
}