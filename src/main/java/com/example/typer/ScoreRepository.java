package com.example.typer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ScoreRepository extends CrudRepository<Score, Integer> {

    @Query(value = "SELECT * FROM Score ORDER BY score DESC LIMIT 1",
            nativeQuery = true)
    Score findHighscore();

    @Query(value = "SELECT * FROM Score ORDER BY id DESC LIMIT 5",
            nativeQuery = true)
    List<Score> findRecentScores();
}
