package Java_Advance.Enums;

enum Laptop{
    Macbook(80), XPS(75), Surface();  // these are objects, we can pass args with the help of the constructor.
    private int price;

    private Laptop(){
        price = 90;
    }   // default if no agrs passed in the object above.
    private Laptop(int price){
        this.price = price;
    }
    // using getters and setters to access price variable.
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        //Laptop l1 =  Laptop.Macbook;
        //System.out.println(l1 + ": " + l1.getPrice());

        for(Laptop laps : Laptop.values()){
            System.out.println(laps + ": " + laps.getPrice());
        }
    }
}
