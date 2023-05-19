package com.example.Movie.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie.models.MovieModel;
import com.example.Movie.repositories.MovieRepository;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public MovieModel saveMovie(MovieModel movieService) {

        return movieRepository.save(movieService);
    }

    public Optional<MovieModel> obtenerPorId(Long id){
        return movieRepository.findById(id);
    }
        
    public ArrayList<MovieModel> getPriority(Integer prioridad) {
        return movieRepository.findByPrioridad(prioridad);
    }

    public boolean deleteMovie(Long id) {
        try{
            movieRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
