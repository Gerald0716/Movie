package com.example.Movie.repositories;

import org.springframework.stereotype.Repository;
import com.example.Movie.models.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public interface MovieRepository extends JpaRepository<MovieModel, Long> {

}
