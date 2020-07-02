package guru.springframework.sfidi.controllers;

import guru.springframework.sfidi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {

    private final GreetingService greetingService;

    public I18NController(@Qualifier("I18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return  greetingService.sayHello();
    }
}
