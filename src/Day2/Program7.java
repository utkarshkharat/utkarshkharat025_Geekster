package Day2;
import java.util.*;


public class Program7
{
    public static void main(String[] arg)
    {

        Scanner uk = new Scanner(System.in);
        System.out.println("Enter the marks of the subject");
        double sub1 = uk.nextDouble();
        double sub2 = uk.nextDouble();
        double sub3 = uk.nextDouble();
        double sub4 = uk.nextDouble();
        double sub5 = uk.nextDouble();

        double sum =sub1+sub2+sub3+sub4+sub5;
        System.out.println("sum of marks of the subject" +sum);
        double percent = sum/5;
        System.out.println("Percent of the student" +percent);


    }
}
