package Java_Core.Arrays;

import java.util.Arrays;

class Student{
    int roll_no;
    String name;
    int age;
}

public class Objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll_no = 1;
        s1.name = "John";
        s1.age = 12;

        Student s2 = new Student();
        s2.roll_no = 2;
        s2.name = "Jane";
        s2.age = 18;

        Student s3 = new Student();
        s3.roll_no = 3;
        s3.name = "Jane";
        s3.age = 22;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        System.out.println(student[0].name + " " + student[0].age);
    }
}
