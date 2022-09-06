package Day4;
import java.util.*;
public class Program3
{
    public static void main(String[] arg)
    {
        Scanner uk = new Scanner(System.in);
        System.out.println("enter the salary");
        int salary = uk.nextInt();
        if(salary<500000)
        {
            System.out.println("No tax to be paid");
        }
        else
        {
            System.out.println("tax to be paid");
        }



    }
}
