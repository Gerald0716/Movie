package com.example.Movie.controllers;

import javax.swing.text.html.Option;
import javax.swing.text.html.parser.Entity;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    private final MoviesAll movieAllService;
    private final MovieService movieService;
    private final MovieRepository movieRepository;

    public MovieController(MoviesAll movieAllService, MovieRepository movieRepository,MovieService movieService) {
        this.movieAllService = movieAllService;
        this.movieRepository = movieRepository;
        this.movieService = movieService;
    }

    @GetMapping("/movie")
    public ResponseEntity<String> GetAllMovies() {
        String response = movieAllService.consumirApiGet();
        System.out.println("Hola, mundo!");
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/movie")
    public MovieModel saveMovie(@RequestBody MovieModel movieModel) {
        return movieRepository.save(movieModel);

    }

   

    @DeleteMapping("/movie/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        boolean deletedMovie =  movieService.deleteMovie(id);
        if (deletedMovie) {
            return ResponseEntity.ok("Pelicula elimina correctamente.");
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error al eliminar la pelicula");
        }
    
    }
    
}
