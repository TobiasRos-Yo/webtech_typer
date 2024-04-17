package com.example.typer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
@GetMapping("/typer")
    public List<UserScore> userScores() {
        UserScore highscore = new UserScore(111, true);
        UserScore lastScore1 = new UserScore(99, false);
        UserScore lastScore2 = new UserScore(101, false);
        UserScore lastScore3 = new UserScore(84, false);
        UserScore lastScore4 = new UserScore(80, false);
        UserScore lastScore5 = new UserScore(77, false);
        return List.of(highscore, lastScore1, lastScore2, lastScore3, lastScore4, lastScore5);
    }
}
