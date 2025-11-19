package Java_Advance.Interfaces;

interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("coding from laptop");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("coding from desktop");
    }
}

class Developer{
    public void devApp(Computer comp){ // here Computer is Computer
        comp.code();
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer Aradhya =  new Developer();
        Aradhya.devApp(desk);   // desk here is referred as Computer
        Aradhya.devApp(lap);
    }
}
