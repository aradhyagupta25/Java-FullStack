package S3_Java_Advance.ExceptionHandling;

// Custom Exception
class guptaException extends Exception {    // always extend Exception or Runtime Exception class for custom exception handling.
    public guptaException(String msg) {
        super(msg);     // if accepting a text in a "throw" then use the Exception() or RuntimeException() constructor to pass the message.
    }
}

public class demo4 {
    public static void main(String[] args) {

        int i = 20 ;
        int j = 0 ;

        try{
            j = 18 / i;
            if( j == 0)
                throw new guptaException("don't do this ma frnd.");
        }
        catch(guptaException e){
            j = 18/1;
            System.out.println("handled and default: " + e);
        }
        catch(ArithmeticException e){
            System.out.println("something went wrong");
        }

        System.out.println("this is the end.");
    }
}
