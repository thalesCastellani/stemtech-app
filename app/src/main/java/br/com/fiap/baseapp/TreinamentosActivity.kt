package br.com.fiap.baseapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class TreinamentosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treinamentos)

        val actionBar: ActionBar? = supportActionBar
        actionBar.let {
            actionBar?.setTitle("Treinamentos")
        }

        val tvTreinamentos = findViewById<TextView>(R.id.tv_treinamentos)
    }
}