package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private final String aWelcomeMessage;

    public WelcomeController(@Value("${welcome.message}") String aWelcomeMessage) {
        this.aWelcomeMessage = aWelcomeMessage;
    }

    @GetMapping("/")
    public String sayHello() {
        return aWelcomeMessage;
    }
}
