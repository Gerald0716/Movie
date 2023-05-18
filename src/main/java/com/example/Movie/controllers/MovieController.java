package com.example.Movie.controllers;

import javax.swing.text.html.parser.Entity;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Movie.models.MovieModel;
import com.example.Movie.repositories.MovieRepository;
import com.example.Movie.services.MovieService;
import com.example.Movie.services.MoviesAll;

@RestController

public class MovieController {
    private final MoviesAll movieService;
    private final MovieRepository movieRepository;

    public MovieController(MoviesAll movieService, MovieRepository movieRepository) {
        this.movieService = movieService;

        this.movieRepository = movieRepository;
    }

    @GetMapping("/movie")
    public ResponseEntity<String> GetAllMovies() {
        String response = movieService.consumirApiGet();
        System.out.println("Hola, mundo!");
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/movie")
    public MovieModel saveMovie(@RequestBody MovieModel movieModel) {
        return movieRepository.save(movieModel);

    }

}
