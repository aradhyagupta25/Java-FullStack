package Java_Core;

import java.lang.instrument.ClassDefinition;

public class Student {

    public int marks(int mark){
        int grade = mark / 100;
        return grade ;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        // type(Student) ref_variable(s1) = memory_alloc(new) Constructor(Student()

        int final_grade = s1.marks(837);
        System.out.println(final_grade);
        System.out.println("hello");
    }

}

