package com.example.seriesandpelisjoseph.usecases

import com.example.seriesandpelisjoseph.data.repositories.MovieRepository
import javax.inject.Inject

class SearchMovies@Inject constructor(private val movieRepository: MovieRepository) {
    suspend fun invoke(titulo: String,pagina:Int) = movieRepository.getMovie(titulo,pagina)
}