package main.java.com.stackroute.PE3;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsecutiveNumbers
{
    public static void main(String[] args)
    {
        String[] digits;int flag=0;
        int[] numArr=new int[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers separated by comma :");
        digits=sc.nextLine().split(",");
        for(int i=0;i<7;i++)
        {
            numArr[i]=parseInt(digits[i]);
        }
        for(int i=0;i<6;i++)
        {
            if(numArr[i+1]!=numArr[i]+1)
                flag=1;
        }
        if(flag!=0)
            System.out.println("Non consecutive Numbers");
        else
            System.out.println("Consecutive Numbers");
    }
}
