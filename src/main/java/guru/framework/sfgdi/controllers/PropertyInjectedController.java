package guru.framework.sfgdi.controllers;

import guru.framework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired
    public GreetingService service;

    public String getGreeting() {
        return service.sayGreeting();
    }
}
