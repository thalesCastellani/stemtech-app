package br.com.fiap.baseapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCadastro = findViewById<TextView>(R.id.tv_cadastrar)
        tvCadastro.setOnClickListener {
            val etUsername = findViewById<EditText>(R.id.et_username)
            intent.putExtra("username", etUsername.text.toString())

            val intent = Intent(this, CadastroActivity::class.java)

            startActivity(intent)
            finish() // matando a tela de login para nao poder voltar para ela
        }

        val tvEsqueceu = findViewById<TextView>(R.id.tv_esqueceu)
        tvEsqueceu.setOnClickListener {
            exibirMensagem(titulo = "Ir para EsqueceuSuaSenhaActivity", mensagem = "Em construção")
        }

        val etUsername = findViewById<EditText>(R.id.et_username)
        etUsername.setText("admin")

        val etSenha = findViewById<EditText>(R.id.et_senha)
        etSenha.setText("123")

        val btnEntrar = findViewById<Button>(R.id.btn_entrar)
        btnEntrar.setOnClickListener {

            val etUsername = findViewById<EditText>(R.id.et_username)
            val etSenha = findViewById<EditText>(R.id.et_senha)

            if (etUsername.text.toString() != "admin" || etSenha.text.toString() != "123") {
                exibirMensagem("Erro", "Username ou senha inválidos")
            } else {
                val intent = Intent(this, HomeActivity::class.java)

                intent.putExtra("username", etUsername.text.toString())

                startActivity(intent)
                finish() // matando a tela de login para nao poder voltar para ela
            }
        }
    }

    fun exibirMensagem(titulo: String, mensagem: String) {
        val builder = AlertDialog.Builder(this)

        builder
            .setTitle(titulo)
            .setMessage(mensagem)
            .setPositiveButton("OK", null)
        builder.create().show()
    }
}