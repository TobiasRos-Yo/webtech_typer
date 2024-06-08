package com.example.typer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    ScoreRepository repo;

    public Score save(Score score) {
        return repo.save(score);
    }

    public Score get(int id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public Score getHighscore() {
        return repo.findHighscore();
    }

    public List<Score> getRecentScores() {
        return repo.findRecentScores();
    }
}
