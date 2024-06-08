package com.example.typer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ScoreRepository extends CrudRepository<Score, Integer> {

    @Query(value = "SELECT TOP * FROM Score ORDER BY score DESC",
            nativeQuery = true)
    Score findHighscore();

    @Query(value = "SELECT TOP 5 * FROM Score ORDER BY id DESC",
            nativeQuery = true)
    List<Score> findRecentScores();
}
