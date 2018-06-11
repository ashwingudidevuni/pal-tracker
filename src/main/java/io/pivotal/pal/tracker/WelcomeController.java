package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class WelcomeController {

    private String _message;
    public WelcomeController(@Value("${WELCOME_MESSAGE}") String msg) {
        this._message = msg;
    }

    @GetMapping("/")
    public String sayHello() {
        return this._message;
    }
}