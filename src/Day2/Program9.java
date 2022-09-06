package Day2;
import java .util.*;
public class Program9 {
    public static void main(String[] arg) {
        Scanner uk = new Scanner(System.in);
        System.out.println("Enter the integer");
        int integer = uk.nextInt();

        boolean ans;
        ans = integer % 7 == 0;
        System.out.println(ans);

    }
}