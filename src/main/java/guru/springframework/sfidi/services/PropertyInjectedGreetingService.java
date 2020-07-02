package guru.springframework.sfidi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements  GreetingService{
    @Override
    public String sayHello() {
        return "Hello World - Property";
    }
}
