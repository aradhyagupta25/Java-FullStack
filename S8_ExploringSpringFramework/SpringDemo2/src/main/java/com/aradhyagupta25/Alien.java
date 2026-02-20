package com.aradhyagupta25;

import org.springframework.stereotype.Component;

//@Component
public class Alien {

    private int age ;
    //private Laptop laptop;
    private Computer computer;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        System.out.println("Setter Called.");   // when injecting a value in the .xml file, it will call the setAge method. -> SETTER INJECTION.
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Alien() {
        System.out.println("Alien Object Created.");
    }

//    public Alien(int age, Laptop laptop) {
//        System.out.println("Constructor Called.");
//        this.age = age;
//        //this.laptop = laptop;
//    }

    public void code(){
        System.out.println("Coding Alien");
        computer.compile();
        //laptop.compile();
    }
}
