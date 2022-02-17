package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.MovieListrowBinding

class MovieAdapter(private var movieList: List<Movie>) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    inner class MyViewHolder(var binding: MovieListrowBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view=LayoutInflater.from(parent.context)
        val binding=MovieListrowBinding.inflate(view, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder:MyViewHolder, position: Int) {
              holder.binding.apply {
                  title.text=movieList[position].name
                  genere.text=movieList[position].genre
                  year.text=movieList[position].year
              }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}