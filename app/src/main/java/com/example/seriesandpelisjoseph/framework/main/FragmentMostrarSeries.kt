package com.example.seriesandpelisjoseph.framework.main

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import coil.loadAny
import com.example.seriesandpelisjoseph.R
import com.example.seriesandpelisjoseph.databinding.FragmentMostrarSeriesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentMostrarSeries : Fragment() {
    private var _binding : FragmentMostrarSeriesBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MostrarSeriesViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMostrarSeriesBinding.inflate(inflater,container,false)
        return binding.root
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args: FragmentMostrarSeriesArgs by navArgs()
        viewModel.getSerie(args.serieid)
        viewModel.SerieData.observe(this,{
            with(binding){
                imageView.loadAny(it.imagen?.let { getString(R.string.pathImage) +  it} ?: run { this.root.context.getDrawable(R.drawable.img) })
                tvTitulo.setText(it.tituloSerie)
                tvDescripcion.setText(it.descripcion)
                tvFecha.setText(it.fecha)
                val adapter = it.temporadas?.let {
                    ArrayAdapter(this.root.context,android.R.layout.simple_spinner_item,
                        it.map { it.nombre }.toList())
                }

                binding.seasonSpinner.adapter = adapter

            }
        })

    }
}