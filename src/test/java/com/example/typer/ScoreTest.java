package com.example.typer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ScoreTest {

    @Test
    void testToString() {
        Score score = new Score(100, 100, "test");
        score.setId(100);

        String expected = "Score{id=100, score=100, acc=100, mode='test'}";
        String actual = score.toString();

        assertEquals(expected, actual);
    }
}
