package Day4;

import java.util.Scanner;

public class Program6
{
    public static void main(String[] arg) {
        Scanner uk = new Scanner(System.in);
        System.out.println("enter the age");
        int age = uk.nextInt();
        System.out.println("enter the Salary");
        int salary= uk.nextInt();

        if(age>60){
            System.out.println("1000 added to salry beacuse your age is above 60 " +
                    "above and final salary  is " +(salary+1000));
        } else if (age>=60 || 41<=age)
        {
            System.out.println("500 added to salry beacuse your age is between 41 to 60 " +
                    "above and final salary  is " +(salary+500));
        }
        else if (age<=40){
            System.out.println("NO money is added beacuse your age is under 40");
        }
    }
}