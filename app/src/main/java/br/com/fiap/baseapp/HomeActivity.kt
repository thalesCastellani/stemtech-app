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
        tvUsername.setText(username)

/*        val btnEstados = findViewById<Button>(R.id.btn_estados)
        btnEstados.setOnClickListener {
            irEstados()
        }*/

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

    fun irEstados() {
        val intent = Intent(this, EstadosActivity::class.java)
        startActivity(intent)
    }

    fun listarUsuarios() {
        val intent = Intent(this, UsuariosActivity::class.java)
        startActivity(intent)
    }
}