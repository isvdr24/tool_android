package com.example.grupo8

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvEquipos = findViewById<RecyclerView>(R.id.rvEquipos)
        rvEquipos.layoutManager = LinearLayoutManager(this)

        val listaEquipos = ArrayList<Equipo>()
        listaEquipos.add(Equipo("Barcelona", "España", "Cules"))
        listaEquipos.add(Equipo("Atletico Madrid", "España", "Colchoneros"))
        listaEquipos.add(Equipo("Real Madrid", "España", "Merengues"))

        // Corrección: Pasar this como contexto y listaEquipos al adaptador AdaptadorEquipo
        val adaptadorEquipo = AdaptadorEquipo(this, listaEquipos)
        rvEquipos.adapter = adaptadorEquipo
    }
}
