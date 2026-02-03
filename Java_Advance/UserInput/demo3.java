package Java_Advance.UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo3 {
    public static void main(String[] args) throws IOException {

        int num = 0;
        BufferedReader bf = null;

//        try{
//            bf = new BufferedReader(new InputStreamReader(System.in));
//            num = Integer.parseInt(bf.readLine());
//            System.out.println(num);
//        }
//        finally {       // executes no matter if the exception is encountered or not.
//            bf.close();     // finally is always used to close the resources.
//            System.out.println("Bye");
//        }

        // "try with resource" is a way to auto-close any resource. it takes the
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }

    }
}
