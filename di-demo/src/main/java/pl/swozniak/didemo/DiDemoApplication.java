package pl.swozniak.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pl.swozniak.didemo.controllers.ConstructorInjectedController;
import pl.swozniak.didemo.controllers.MyController;
import pl.swozniak.didemo.controllers.PropertyInjectedController;
import pl.swozniak.didemo.controllers.SetterInjectedController;

@SpringBootApplication
//@ComponentScan(basePackages = {"pl.swozniak.didemo.services", "pl.swozniak.didemo"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

//        controller.hello();

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
