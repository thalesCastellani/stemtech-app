package br.com.fiap.baseapp

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseManager(context: Context, name: String) : SQLiteOpenHelper(context, name, null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        val createQuery = "CREATE TABLE tb_usuario (" +
                "id_usuario INT NOT NULL," +
                "nome VARCHAR(80) NOT NULL," +
                "email VARCHAR(200) NOT NULL," +
                "cpf VARCHAR(11) NOT NULL," +
                "telefone VARCHAR(11) NOT NULL," +
                "PRIMARY KEY (id_usuario)" +
                ");"

        db?.execSQL(createQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS tb_usuario")
        onCreate(db)
    }

    fun insertUser(id: Int, nome: String, email: String, cpf: String, telefone: String) {
        val db = this.writableDatabase

        val contentValues = ContentValues()
        contentValues.put("id_usuario", id)
        contentValues.put("nome", nome)
        contentValues.put("email", email)
        contentValues.put("cpf", cpf)
        contentValues.put("telefone", telefone)

        db.insert("tb_usuario", "id_usuario", contentValues)
    }

    fun listUser(): Cursor {
        val db = this.readableDatabase

        return db.rawQuery("SELECT nome, email, cpf, telefone FROM tb_usuario", null)
    }

    fun deleteUser() {
        val db = this.writableDatabase

        db.delete("tb_usuario", "id_usuario=1", null)
    }
}