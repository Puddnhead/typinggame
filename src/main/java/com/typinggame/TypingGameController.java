package com.typinggame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by MVW on 4/22/2020.
 */
@RestController
@RequestMapping("/typinggame")
public class TypingGameController {

    @Autowired
    private TypingGameService typingGameService;

    @RequestMapping("/highScores")
    public List<Score> getHighScores(@RequestParam Integer count) {
        return typingGameService.getHighScores(count);
    }
}
