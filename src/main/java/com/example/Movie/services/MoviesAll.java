package com.example.Movie.services;

import java.io.PrintWriter;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MoviesAll {

    public String consumirApiGet() {
        RestTemplate restTemplate = new RestTemplate();
        String API_KEY = "c135bfb70e9d16a9a2487a0cb60dc6ce";
        String apiURL = "https://api.themoviedb.org/3/discover/movie?include_adult=false&include_video=false&language=en-US&page=1&sort_by=popularity.desc&api_key="
                + API_KEY;

        ResponseEntity<String> getMovies = restTemplate.getForEntity(apiURL, String.class);

        if (getMovies.getStatusCode() == HttpStatus.OK) {
            String responseBody = getMovies.getBody();

            return responseBody;
        } else {

            System.out.println("Error no se encontraron datos");
            return "Error: Error al obtener los datos";
        }

    }

    // metodo privado

}
