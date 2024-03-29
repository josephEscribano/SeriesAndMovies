package com.example.seriesandpelisjoseph.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Serie(
    val id: Int,
    val idApi: Int,
    val imagen: String?,
    val tituloSerie: String,
    val descripcion: String,
    val fecha: String,
    val puntuacion: Int?,
    val temporadas: List<Temporada>?,
    val actores: List<Actor>?
) : Parcelable