package guru.springframework.sfidi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements  GreetingService{
    @Override
    public String sayHello() {
        return "Hello World - Constructor";
    }
}
