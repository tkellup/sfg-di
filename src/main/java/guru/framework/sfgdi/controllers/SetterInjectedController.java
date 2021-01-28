package guru.framework.sfgdi.controllers;

import guru.framework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService service;

    @Qualifier("setterInjectedGreetingServiceImpl")
    @Autowired
    public void setService(GreetingService service) {
        this.service = service;
    }

    public String getGreeting() {
        return this.service.sayGreeting();
    }
}
