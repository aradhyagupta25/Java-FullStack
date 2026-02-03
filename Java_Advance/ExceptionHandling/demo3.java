package Java_Advance.ExceptionHandling;
// Throw Keyword
public class demo3 {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        try{
            j = 18/i;
            if( j == 0)
                    throw new ArithmeticException("don divide by zero");    // "throw" keyword is used to throw the exception and "catch" keyword will catch it. it will require to create a new Exception object.
                    // In ArithmeticException() constructor, we can pass a message to be passed with the catch block.
        }
        catch(ArithmeticException e){
            j = 18/1;
            System.out.println("Default Output " + e);
        }

        System.out.println("This is the end.");
    }
}
