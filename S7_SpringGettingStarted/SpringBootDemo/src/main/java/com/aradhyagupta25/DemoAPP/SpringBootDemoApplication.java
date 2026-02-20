package com.aradhyagupta25.DemoAPP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);	//activates the spring framework. has container to create  spring beans.

		System.out.println("SanFrancisco 2027");


		// JVM -> CONTAINER -> obj1, obj2, obj3. everytime Spring will create an object, it will be available inside the container.
		Alien a = context.getBean(Alien.class);
		a.code();

		//Laptop l = context.getBean(Laptop.class);
		//l.compile();
	}

}
