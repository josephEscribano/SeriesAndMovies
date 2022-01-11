package com.example.seriesandpelisjoseph.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Actor(
    val id:Int,
    val idApi:Int,
    val imagen:String?,
    val nombre:String,
    val actuaMovie: List<Movie>?,
    val actuaSerie:List<Serie>? = null
) : Parcelable
