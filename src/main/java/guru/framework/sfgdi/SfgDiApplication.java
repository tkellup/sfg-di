package guru.framework.sfgdi;

import guru.framework.sfgdi.controllers.ConstructorInjectedController;
import guru.framework.sfgdi.controllers.MyController;
import guru.framework.sfgdi.controllers.PropertyInjectedController;
import guru.framework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        System.out.println("-------Primary");
        MyController controller = (MyController) context.getBean("myController");
        System.out.println(controller.sayHello());

        System.out.println("-------Property");
        PropertyInjectedController propertyController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyController.getGreeting());

        System.out.println("-------Setter");
        SetterInjectedController setterController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterController.getGreeting());

        System.out.println("-------Constructor");
        ConstructorInjectedController constructorController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorController.getGreeting());
    }

}
