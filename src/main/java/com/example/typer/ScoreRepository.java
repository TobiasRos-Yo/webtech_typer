package com.example.typer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ScoreRepository extends CrudRepository<Score, Integer> {

    @Query(value = "SELECT * FROM Score ORDER BY score DESC LIMIT 1",
            nativeQuery = true)
    Score findHighscore();

    @Query(value = "SELECT * FROM Score WHERE mode = ?1 ORDER BY score DESC LIMIT 3",
            nativeQuery = true)
    List<Score> findTopScoresByMode(@Param("mode") String mode);

    @Query(value = "SELECT * FROM Score ORDER BY id DESC LIMIT 5",
            nativeQuery = true)
    List<Score> findRecentScores();
}
