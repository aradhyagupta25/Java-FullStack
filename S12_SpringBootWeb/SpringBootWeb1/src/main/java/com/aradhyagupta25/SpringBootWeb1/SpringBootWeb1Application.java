package com.aradhyagupta25.SpringBootWeb1;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWeb1Application {

	public static void main(String[] args) throws LifecycleException {

		SpringApplication.run(SpringBootWeb1Application.class, args);

//		Tomcat  tomcat = new Tomcat();
//
//		Context context = tomcat.addContext("", null);
//		Tomcat.addServlet(context, "home1", new HomeController());
//		context.addServletMappingDecoded("/index", "home1");
//		tomcat.start();
//		tomcat.getServer().await();


	}

}
