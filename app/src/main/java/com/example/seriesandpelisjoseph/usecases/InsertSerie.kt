package com.example.seriesandpelisjoseph.usecases


import com.example.seriesandpelisjoseph.data.model.toSerieWithTemporadas
import com.example.seriesandpelisjoseph.data.repositories.SerieRepository
import com.example.seriesandpelisjoseph.domain.Serie
import javax.inject.Inject

class InsertSerie @Inject constructor(private val serieRepository: SerieRepository) {

    suspend fun invoke(serie: Serie) = serieRepository.insertSerie(serie.toSerieWithTemporadas())
}