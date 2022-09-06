package Day2;

import java.util.*;

public class Program1
{
    public static void main(String[] arg)
    {
        int d  ;
        double pi = 3.14,area;
        Scanner uk = new Scanner(System.in);
        System.out.println("Enter the diameter");
        d = uk.nextInt();

        area = pi*d;
        System.out.println("area of circle is " +area);
    }
}
