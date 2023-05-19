package com.example.Movie.services;

import java.util.ArrayList;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.data.jpa.repository.JpaRepository;
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

    public Optional<MovieModel> getById(Long id) {
        return movieRepository.findById(id);
    }

    public MovieModel updateModel(Long id, MovieModel movieModel) {
        MovieModel movie = movieRepository.findById(id).orElse(null);

        if (movie == null) {
            return null;
        }
        movie.setTitle(movieModel.getTitle());
        movie.setSynopsis(movieModel.getSynopsis());
        movie.setYear(movieModel.getYear());

        return movieRepository.save(movie);
    }

    public boolean deleteMovie(Long id) {
        try {
            movieRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
