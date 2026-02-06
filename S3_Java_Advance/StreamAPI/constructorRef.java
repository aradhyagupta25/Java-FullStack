package S3_Java_Advance.StreamAPI;

import S2_Java_Core.Classes.Student;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Studentss{
    private String name;
    private int age;

    public Studentss(){}

    public Studentss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class constructorRef {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("A", "B", "C");

        List<Studentss> students = new ArrayList<>();

//        for(String name : names){
//            students.add(new Student(name));
//        }
//        System.out.println(students);

        students = names.stream()
                //.map(name -> new Studentss(name))
                .map(Studentss::new)    //using Constructor Referencing to create new object. map will create new object with one name at a time.
                .toList();
        System.out.println(students);
    }
}
