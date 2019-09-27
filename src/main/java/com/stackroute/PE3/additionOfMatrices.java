package main.java.com.stackroute.PE3;
import java.util.Scanner;

public class additionOfMatrices
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int rows,columns;
        System.out.println("Enter the no. of rows in the matrices");
        rows=sc.nextInt();
        System.out.println("Enter the no. of columns in the matrices");
        columns=sc.nextInt();
        int[][] matrixOne=new int[rows][columns];
        int[][] matrixTwo=new int[rows][columns];
        int[][] matrixSum=new int[rows][columns];

        System.out.println("Enter elements of matrixOne row-wise");

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
                matrixOne[i][j] = sc.nextInt();
        }

        System.out.println("Enter elements of matrixTwo row-wise");

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
                matrixTwo[i][j] = sc.nextInt();
        }

        System.out.println("Sum of Matrices: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                matrixSum[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                System.out.print(matrixSum[i][j]+"\t");
            }
            System.out.print("\n");
        }


    }

}
