package com.aradhyagupta25.DemoAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component      // tells spring has to create and manage object of this class. without it, spring won't create an object of the class.
public class Alien {

@Autowired  // wiring b/w Alien and Laptop class, and it's spring's responsibility to search laptop's object inside the Container.
    Laptop laptop;
    public void code(){

        laptop.compile();
        System.out.println("Coding.");
    }
}
