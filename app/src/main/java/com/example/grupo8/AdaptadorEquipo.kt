package com.example.grupo8

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorEquipo(private val context: Context, private val listaEquipos: List<Equipo>) :
    RecyclerView.Adapter<AdaptadorEquipo.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(context).inflate(R.layout.item_rv_equipo, parent, false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val equipo = listaEquipos[position]

        holder.tvNombre.text = equipo.nombre
        holder.tvPais.text = equipo.pais
        holder.tvMote.text = equipo.mote

        // Configurar clic del botón dentro del ViewHolder
        holder.btnVerCodigos.setOnClickListener {
            // Abrir la actividad Codigos
            val intent = Intent(context, Codigos::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listaEquipos.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNombre: TextView = itemView.findViewById(R.id.tvNombre)
        val tvPais: TextView = itemView.findViewById(R.id.tvPais)
        val tvMote: TextView = itemView.findViewById(R.id.tvMote)
        val btnVerCodigos: Button = itemView.findViewById(R.id.btnVerCodigos)
    }
}



