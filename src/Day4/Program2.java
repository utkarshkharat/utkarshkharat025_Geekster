package Day4;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] arg) {
        Scanner uk = new Scanner(System.in);
        System.out.println("Enter the no you want to check that it is even or add");
        int a = uk.nextInt();

        if (a % 2 == 0) {
            System.out.println("Given number is Even " + a);
        } else {
            System.out.println("Given number is Odd " + a);
        }

    }
}