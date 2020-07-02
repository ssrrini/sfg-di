package guru.springframework.sfidi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("I18NService")
public class I18NEnglishGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello World - EN";
    }
}
