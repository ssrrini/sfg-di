package guru.springframework.sfidi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FR")
@Service("I18NService")
public class I18NFrenchGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "Bonjour - FR";
    }
}
