package guru.framework.sfgdi;

import guru.framework.sfgdi.controllers.SetterInjectedController;
import guru.framework.sfgdi.services.GreetingService;
import guru.framework.sfgdi.services.PrimaryGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectedControllerTest {

    SetterInjectedController controller;
    GreetingService service;

    @BeforeEach
    public void setUp() {
        controller = new SetterInjectedController();
        service = new PrimaryGreetingService();
        controller.setService(service);
    }

    @Test
    public void testGreeting() {
        System.out.println(controller.getGreeting());
    }
}
