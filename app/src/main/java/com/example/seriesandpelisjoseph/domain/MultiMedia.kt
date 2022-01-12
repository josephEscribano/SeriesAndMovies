package com.example.seriesandpelisjoseph.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate

@Parcelize
data class MultiMedia(
    val id: Int = 0,
    val idApi: Int,
    val imagen: String?,
    val titulo: String,
    val descripcion: String?,
    val fechaEmision:String?,
    val tipo: String
): Parcelable
