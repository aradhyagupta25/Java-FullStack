package Java_Advance.UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws IOException {

        //System.out.println("Enter a No: ");
        // int num = System.in.read();      //reads one char at a time. returns ASCII value of the input.

        // BufferReader
        System.out.println("Enter using bf: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);     // BufferReader can take input from any source. ex- files etc.

       int num = Integer.parseInt(bf.readLine());       // readline() reads strings. we will parse the string into an Integer.
        System.out.println(num);
        bf.close();     // after opening or accessing the resource, one must close the resource in order to avoid data leaks. it's not mandatory but a good practice.


    }
}
