package guru.springframework.sfidi;

import guru.springframework.sfidi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfiDiApplication {

	public static void main(String[] args) {

	ApplicationContext ctx = SpringApplication.run(SfiDiApplication.class, args);

		I18NController controller = (I18NController)ctx.getBean("i18NController");
		System.out.println(controller.getGreeting());
		System.out.println("__________________");

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.getGreeting();

		System.out.println(greeting);

		System.out.println("---Property");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController =
				(SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println("-----Setter");
		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println("------Constructor");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
