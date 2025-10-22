package Java_Core.Encapsulation;

class Student {
    private String name;
    private int age;

    public String getName() {   // Name
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {   // Age
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Aradhya Gupta");
        s1.setAge(20);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
