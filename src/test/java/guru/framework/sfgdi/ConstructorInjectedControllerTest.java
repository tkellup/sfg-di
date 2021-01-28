package guru.framework.sfgdi;

import guru.framework.sfgdi.controllers.ConstructorInjectedController;
import guru.framework.sfgdi.services.GreetingService;
import guru.framework.sfgdi.services.PrimaryGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    GreetingService service;

    @BeforeEach
    public void setUp() {
        service = new PrimaryGreetingService();
        controller = new ConstructorInjectedController(service);
    }

    @Test
    public void testGreeting() {
        System.out.println(controller.getGreeting());
    }
}
