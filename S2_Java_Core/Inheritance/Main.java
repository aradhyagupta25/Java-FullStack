package S2_Java_Core.Inheritance;

class Calc{

    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
}

public class Main extends Calc{

    public int multi(int a, int b){
        return a * b;
    }

     public int div(int a, int b){
        return a / b;
     }

    public static void main(String[] args) {

        Main c1 = new Main();
        System.out.println(c1.add(1,2));
        System.out.println(c1.sub(2,3));
        System.out.println(c1.multi(3,4));
        System.out.println(c1.div(5,6));

    }
}
