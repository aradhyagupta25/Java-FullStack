package S3_Java_Advance.ExceptionHandling;

// ERRORS: Compile Time Error, Runtime Error, Logical Error.

// 1. Compile Time Error: due to syntactical error. which are indicated in the code and shown after compilation as well.

// 2. Runtime Error: also called "Exceptions". the programs stops running/working.

// 3. Logical Error: also called bugs. gives wrong output.

// Statements: Normal and Critical

public class demo {
    public static void main(String[] args) {

        int i = 0 ;
        //int j = 18/i;   // will throw an Exception and the code will execute till here only.

        int j = 0;

        try     // java will try to execute this block and move on to the next code to execute.
        {
            j = 18/i;
        }       // in case of an error, java will throw an exception, and we need to "catch" it.
        // java will throw an exception as on "Object" and we have to accept it as an "Object".
        catch(Exception e){ //only executed in case of an exception otherwise ignored.
            System.out.println("Something went wrong " + e);
        }

        System.out.println(j);

        System.out.println("if code runs fully");
    }
}
