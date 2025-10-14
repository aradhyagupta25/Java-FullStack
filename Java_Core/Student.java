package Java_Core;

import java.lang.instrument.ClassDefinition;

public class Student {

    String name = "Aradhya"; // Instance Variable

    public int marks(int mark){
        int grade = mark / 100;     //local variable
        return grade ;
    }
    public float marks(float mark){
        float grade = mark / 100;
        return grade ;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        // type(Student) ref_variable(s1) = memory_alloc(new) Constructor(Student()
        Student s2 = new Student();

        int final_grade1 = s1.marks(837);   // Local variable
        float final_grade2 = s1.marks(923.45f);
        System.out.println(final_grade1);
        System.out.println(final_grade2);

        s1.name = "Gupta";
        System.out.println(s1.name);
        System.out.println(s2.name);

    }
}

