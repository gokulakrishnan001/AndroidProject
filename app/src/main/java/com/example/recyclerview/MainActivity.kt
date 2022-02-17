package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val movieList= mutableListOf(
            Movie("Harry Potter","Fantasy","2004")
        )
        val adapter=MovieAdapter(movieList)
        binding.recycle.adapter=adapter
        binding.recycle.layoutManager=LinearLayoutManager(this)
        binding.button.setOnClickListener {
            val title=binding.title.text.toString()
            val genre=binding.genere.text.toString()
            val year=binding.year.text.toString()
            val addMovie=Movie(title,genre,year)
            movieList.add(addMovie)
            adapter.notifyItemInserted(movieList.size-1)
        }
    }
}