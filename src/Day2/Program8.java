package Day2;

import java.util.Scanner ;

public class Program8
{
    public static void main(String[] arg) {
        Scanner uk = new Scanner(System.in);
        System.out.println("Enter the integers");
        int a = uk.nextInt();
        int b = uk.nextInt();
        int c = uk.nextInt();
        int d = uk.nextInt();

        int Product = a * b * c * d;
        boolean ans;
        ans = Product > 1000;
        System.out.println(ans);
    }
}
