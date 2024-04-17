package com.example.typer;

public class UserScore {

    private int score;
    private boolean isHighscore;

    public UserScore(int score, boolean isHighscore) {
        this.score = score;
        this.isHighscore = isHighscore;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public boolean isHighscore() {
        return isHighscore;
    }
    public void setHighscore(boolean isHighscore) {
        this.isHighscore = isHighscore;
    }
}
