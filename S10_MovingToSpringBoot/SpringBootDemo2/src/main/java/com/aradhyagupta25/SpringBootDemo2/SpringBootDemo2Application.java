package com.aradhyagupta25.SpringBootDemo2;

import com.aradhyagupta25.SpringBootDemo2.model.Laptop;
import com.aradhyagupta25.SpringBootDemo2.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootDemo2Application.class, args);

//		Alien a1 = context.getBean(Alien.class);
//		a1.code();
//		System.out.println(a1.getAge());

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap1 = context.getBean(Laptop.class);
		service.addLaptop(lap1);

	}

}
