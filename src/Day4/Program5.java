package Day4;

import java.util.Scanner;

public class Program5
{
    public static void main(String[] arg) {
        Scanner uk = new Scanner(System.in);
        System.out.println("enter the age");
        int age = uk.nextInt();

        if(age>=70)
        {
            System.out.println("Super Senior Citizen");
        }
        else if (age<70 && age>59)
        {
            System.out.println("Senior Citizen");
        }
        else if (age<59 && age>18)
        {
            System.out.println("Adult");
        }
        else if (age<18 && age>=1)
        {
            System.out.println("Underage");
        }
        else
        {
            System.out.println("New born");
        }
    }
}
