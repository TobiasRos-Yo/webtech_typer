package com.example.typer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5173", "http://127.0.0.1:5173", "https://webtech-typer-frontend.onrender.com"})
public class MyController {

    @Autowired
    ScoreService service;

    @PostMapping("/typer")
    public Score createScore(@RequestBody Score score) {
        return service.save(score);
    }

    @GetMapping("/typer/{id}")
    public Score getScore(@PathVariable int id) {
        return service.get(id);
    }

    @GetMapping("/typer/highscore")
    public Score getHighscore() {
        return service.getHighscore();
    }

    @GetMapping("/typer/recent")
    public List<Score> getRecentScores() {
        return service.getRecentScores();
    }
}
