package guru.framework.sfgdi;

import guru.framework.sfgdi.controllers.PropertyInjectedController;
import guru.framework.sfgdi.services.GreetingService;
import guru.framework.sfgdi.services.PrimaryGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    public void setUp() {
        controller = new PropertyInjectedController();
        controller.service = new PrimaryGreetingService();
    }

    @Test
    public void testGreeting() {
        System.out.println(controller.getGreeting());
    }
}
