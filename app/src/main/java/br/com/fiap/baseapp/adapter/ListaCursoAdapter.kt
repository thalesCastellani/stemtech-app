package br.com.fiap.baseapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import br.com.fiap.baseapp.R
import br.com.fiap.baseapp.model.Curso

class ListaCursoAdapter(var cursos: List<Curso>, var context: Context) : BaseAdapter() {

    override fun getCount(): Int {
        return cursos.size
    }

    override fun getItem(position: Int): Any {
        return cursos[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val viewCriada = LayoutInflater.from(context).inflate(R.layout.item_curso, parent, false)

        val curso = cursos[position]

        val id = viewCriada.findViewById<TextView>(R.id.item_curso_id)
        id.text = curso.id

        val nome = viewCriada.findViewById<TextView>(R.id.item_curso_nome)
        nome.text = curso.nome

        val formacao = viewCriada.findViewById<TextView>(R.id.item_curso_formacao)
        formacao.text = curso.formacao

        val categoria = viewCriada.findViewById<TextView>(R.id.item_curso_categoria)
        categoria.text = curso.categoria

        return viewCriada
    }

}
