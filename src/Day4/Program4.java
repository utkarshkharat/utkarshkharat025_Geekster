package Day4;
import java.util.*;
public class Program4
{
    public static void main(String[]arg)
    {
        Scanner uk = new Scanner(System.in);
        System.out.println("enter the marks of the student");
        int marks = uk.nextInt();
        if (marks<33)
        {
            System.out.println("marks of the student adding the grace marks is " +(marks+4));
        }
        else
        {
            System.out.println("no Grace marks needed in " +marks);
        }
    }
}
