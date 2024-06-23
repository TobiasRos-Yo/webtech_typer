package com.example.typer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@SpringBootTest
public class ScoreServiceTest {

    @Autowired
    private ScoreService scoreService;

    @MockBean
    private ScoreRepository scoreRepository;

    @Test
    void testGet() {
        var s1 = new Score(55, 55, "test");
        var s2 = new Score(66, 66, "test");
        doReturn(Optional.of(s1)).when(scoreRepository).findById(5);
        doReturn(Optional.of(s2)).when(scoreRepository).findById(6);

        Score actual = scoreService.get(5);

        assertEquals(actual.getScore(), 55);
    }

}
