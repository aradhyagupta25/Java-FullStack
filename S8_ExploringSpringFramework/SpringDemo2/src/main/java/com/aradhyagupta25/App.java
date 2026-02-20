package com.aradhyagupta25;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main( String[] args )
    {





    }
}

// 1. creating project with maven archetype
// 2. add spring dependency in the pom.xml
// 3. create a container using ApplicationContext Interface .
// 4. create object of ClassPathXmlApplicationContext(xml file path).
// 5. create a xml file: main -> resources -> .xml file. and add the path in the constructor
// 6. paste "<beans>" for the xml based config and inside beans, ask spring to create an object of the required class using the <bean id="" class=""></bean> .




//// creates a container for our project.
//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // xml based configuration for container is present in the .xml file. it will create objects of all the class with the "bean" tag.
//
//Alien a1 =  context.getBean("alien1", Alien.class);    // from the container we are calling the Object of Class Alien.
//
//        a1.code();
//
////Alien a2 = (Alien) context.getBean("alien1");     // will create only one object doesn't matter how many times it's called.
////Alien a2 = (Alien) context.getBean("alien2");
//
//
//
////a1.age = 21;
//        System.out.println(a1.getAge());
////a2.age = 22;
////System.out.println(a2.age);
//
////        Dekstop dekstop = (Dekstop) context.getBean("computer1");