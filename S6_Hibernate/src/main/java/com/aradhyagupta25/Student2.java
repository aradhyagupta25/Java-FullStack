package com.aradhyagupta25;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity     //entity. will create a table of the class .
public class Student2 {

    @Id     // setting roll no. as Primary Key
    private int roll;
    private String sname;
    private int age;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                '}';
    }
}
