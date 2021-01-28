package guru.framework.sfgdi.controllers;

import guru.framework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService service;

    @Autowired //optional--not required
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingServiceImpl") GreetingService service) {
        this.service = service;
    }

    public String getGreeting() {
        return this.service.sayGreeting();
    }
}
