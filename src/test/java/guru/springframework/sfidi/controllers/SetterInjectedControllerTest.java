package guru.springframework.sfidi.controllers;

import guru.springframework.sfidi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController   controller;
    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void greeting(){
        System.out.println(controller.getGreeting());
    }

}