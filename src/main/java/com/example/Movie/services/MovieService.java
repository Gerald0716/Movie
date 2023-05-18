package com.example.Movie.services;

import java.util.ArrayList;

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
}
