package com.example.seriesandpelisjoseph.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    val id: Int = 0,
    val idApi: Int,
    val imagen: String?,
    val tituloPeli: String,
    val visto:Boolean,
    val puntuacion: Int,
    val descripcion: String?
) : Parcelable
