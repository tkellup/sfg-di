package guru.framework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello Guys!-Constructor";
    }
}
