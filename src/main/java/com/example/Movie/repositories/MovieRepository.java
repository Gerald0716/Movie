package com.example.Movie.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Movie.models.MovieModel;

@Repository
public interface MovieRepository extends CrudRepository<MovieModel, Long> {
    public abstract ArrayList<MovieModel> findByPrioridad(Integer Prioridad);
    

}
