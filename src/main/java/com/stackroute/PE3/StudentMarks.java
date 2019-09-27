package main.java.com.stackroute.PE3;
import java.util.Scanner;

class InvalidMarksException extends Exception
{
    InvalidMarksException(String s)
    {
        super(s);
    }
}

public class StudentMarks
{
    public static void main(String[] args) throws InvalidMarksException
    {
        int numOfStudents;
        System.out.println("Enter No. Of Students :");
        Scanner sc=new Scanner(System.in);
        numOfStudents=sc.nextInt();

        int[] stuGrades=new int[numOfStudents];
        int i=0;

            while (i < numOfStudents)
            {
                System.out.println("Enter grade(marks)  of Student : " + (i + 1));
                stuGrades[i] = sc.nextInt();
                try
                {
                    if (stuGrades[i] < 0 || stuGrades[i] > 100)
                        throw new InvalidMarksException("Marks can be in the range of 0-100");
                }
                catch (InvalidMarksException e)
                {
                    System.out.println("Invalid marks:: Enter marks in the range of 0-100");
                    continue;
                }
                i++;
            }

    }

}
