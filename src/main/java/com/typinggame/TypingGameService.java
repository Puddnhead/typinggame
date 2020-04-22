package com.typinggame;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by MVW on 4/22/2020.
 */
@Component
public class TypingGameService {

    public static final int DEFAULT_COUNT = 5;

    public static List<String> names = Arrays.asList(
            "Me",
            "You",
            "Them",
            "Us",
            "Nobody",
            "Somebody"
    );

    public static List<Score> scores;

    static {
        scores = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int nameIndex = (int)(Math.random() * names.size());
            long randomScore = (long)(Math.random() * 1000);
            String name = names.get(nameIndex);
            scores.add(new Score(name, randomScore));
            Collections.sort(scores, Comparator.comparing(score -> score.getScore() * -1));
        }
    }

    List<Score> getHighScores(Integer count) {
        int scoreCount = count != null ? count : DEFAULT_COUNT;
        scoreCount = scoreCount < scores.size() ? scoreCount : scores.size();
        return scores.subList(0, scoreCount);
    }

    void saveScore(Score score) {
    }
}
