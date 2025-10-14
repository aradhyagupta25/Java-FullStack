package Java_Core;

import java.lang.instrument.ClassDefinition;

public class Student {

    public int marks(int mark){
        int grade = mark / 100;
        return grade ;
    }
    public float marks(float mark){
        float grade = mark / 100;
        return grade ;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        // type(Student) ref_variable(s1) = memory_alloc(new) Constructor(Student()

        int final_grade1 = s1.marks(837);
        float final_grade2 = s1.marks(923.45f);
        System.out.println(final_grade1);
        System.out.println(final_grade2);

    }
}

