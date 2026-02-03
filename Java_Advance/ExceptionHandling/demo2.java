package Java_Advance.ExceptionHandling;

public class demo2 {
    public static void main(String[] args) {

        int i = 2;
        int j = 0;
        String str = null;

        int nums[] = new int[5];

        try{
            j = 18/i;
            System.out.println("len: " + str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide with zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("stay within the limits.");
        }
        catch(Exception e){     // this should be put at last cause it can handle every exception and doesn't allow specific exception handling.
            System.out.println("went wrong " + e);
        }

        System.out.println(j);
        System.out.println("got so far");
    }
}

// Exception Hierarchy

// Object class -> Throwable class    // many words which ends with "-able" are interfaces but here "Throwable is a class".

// Throwable class -> Error( which we can't handle ) and Exception( which we can handle ).

// Error -> Thread Death, IO Error, Virtual Machine Error, Out of memory.

// Exception -> RuntimeException, SQL Exception, IO Exception.

// RuntimeException -> Arithmetic, ArrayIndex..., Null Pointer.         // also called "Unchecked" exceptions because we may or may not handle these exceptions ( up to us ).

// SQL and IO are "Checked" exceptions since it must be handled in case of an exception.