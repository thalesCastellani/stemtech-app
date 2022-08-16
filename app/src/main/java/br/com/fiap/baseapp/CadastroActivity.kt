package br.com.fiap.baseapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val actionBar: ActionBar? = supportActionBar
        actionBar.let {
            actionBar?.setTitle("Cadastro")
        }

        val btnCadastrar = findViewById<Button>(R.id.btn_cadastrar)
        btnCadastrar.setOnClickListener {

            val etNome = findViewById<EditText>(R.id.et_nome)
            val etEmail = findViewById<EditText>(R.id.et_email)
            val etCpf = findViewById<EditText>(R.id.et_cpf)
            val etTelefone = findViewById<EditText>(R.id.et_telefone)

            val db = DatabaseManager(this, "usuarios")

            db.deleteUser()
            db.insertUser(
                1,
                etNome.text.toString(),
                etEmail.text.toString(),
                etCpf.text.toString(),
                etTelefone.text.toString()
            )

            Toast.makeText(
                this,
                "Usuario gravado com sucesso!",
                Toast.LENGTH_LONG
                ).show()

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}