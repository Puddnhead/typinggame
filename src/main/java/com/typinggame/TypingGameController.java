package com.typinggame;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MVW on 4/22/2020.
 */
@RestController
@RequestMapping("/typinggame")
public class TypingGameController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello world!";
    }
}
