package br.com.fiap.baseapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class UsuariosActivity : AppCompatActivity() {
    @SuppressLint("Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuarios)

        val actionBar: ActionBar? = supportActionBar
        actionBar.let {
            actionBar?.setTitle("Usuarios")
        }

        val txvNomeUsuario = findViewById<TextView>(R.id.tv_nome_usuario)
        val txvEmailUsuario = findViewById<TextView>(R.id.tv_email_usuario)
        val txvCpfUsuario = findViewById<TextView>(R.id.tv_cpf_usuario)
        val txvTelefoneUsuario = findViewById<TextView>(R.id.tv_telefone_usuario)

        val db = DatabaseManager(this, "usuarios")

        val cursor = db.listUser()
        var nome = ""
        var email = ""
        var cpf = ""
        var telefone = ""

        if (cursor.count > 0) {
            cursor.moveToFirst()
            nome = cursor.getString(cursor.getColumnIndex("nome"))
            email = cursor.getString(cursor.getColumnIndex("email"))
            cpf = cursor.getString(cursor.getColumnIndex("cpf"))
            telefone = cursor.getString(cursor.getColumnIndex("telefone"))
        }

        txvNomeUsuario.text = nome
        txvEmailUsuario.text = email
        txvCpfUsuario.text = cpf
        txvTelefoneUsuario.text = telefone
    }
}