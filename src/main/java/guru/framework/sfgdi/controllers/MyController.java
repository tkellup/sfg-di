package guru.framework.sfgdi.controllers;

import guru.framework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService service;

    public MyController(GreetingService service) {
        this.service = service;
    }

    public String sayHello() {
        return service.sayGreeting();
    }
}
