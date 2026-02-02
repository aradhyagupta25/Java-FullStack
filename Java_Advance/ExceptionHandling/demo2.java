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
