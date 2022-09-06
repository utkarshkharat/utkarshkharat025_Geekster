
package Day2;
import java.util.*;
public class Program2
{
    public static void main(String[] arg)
    {
        Scanner uk = new Scanner(System.in);
        System.out.println("Enter the base and height");
        double Base = uk.nextDouble();
        double Height = uk.nextDouble();

        double x = Base * Height ;
        System.out.println("area of triangle" +x);
    }
}
