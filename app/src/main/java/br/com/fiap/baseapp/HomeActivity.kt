package br.com.fiap.baseapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val actionBar: ActionBar? = supportActionBar
        actionBar.let {
            actionBar?.setTitle("Home")
        }

        val username = intent.getStringExtra("username")
        val tvUsername = findViewById<TextView>(R.id.tv_username)
        tvUsername.text = username

        val btnTreinamentos = findViewById<Button>(R.id.btn_treinamentos)
        btnTreinamentos.setOnClickListener {
            irTreinamentos()
        }

        val btnUsuarios = findViewById<Button>(R.id.btn_usuarios)
        btnUsuarios.setOnClickListener {
            listarUsuarios()
        }

        val btnSair = findViewById<Button>(R.id.btn_sair)
        btnSair.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun irTreinamentos() {
        val intent = Intent(this, TreinamentosActivity::class.java)
        startActivity(intent)
    }

    private fun listarUsuarios() {
        val intent = Intent(this, UsuariosActivity::class.java)
        startActivity(intent)
    }
}