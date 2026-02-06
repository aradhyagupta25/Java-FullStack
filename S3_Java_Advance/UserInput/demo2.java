package S3_Java_Advance.UserInput;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        // Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num2 = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc2.nextLine();

        System.out.println(num2);
        System.out.println(str);
    }
}
