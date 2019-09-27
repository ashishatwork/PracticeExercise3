package main.java.com.stackroute.PE3;

import java.util.Scanner;

public class RemoveVowels
{
    public static void main(String[] args)
    {
        int numOfPlaces=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of places you want to enter :");
        numOfPlaces=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the places one by one");
        String[] places = new String[numOfPlaces];
        for(int i=0;i<numOfPlaces;i++)
        {
            places[i]=sc.nextLine();
        }

        for(int i=0;i<numOfPlaces;i++)
        {
           places[i]=places[i].replaceAll("[aeiou]","");

        }

        for(int i=0;i<numOfPlaces;i++)
        {
            System.out.println(places[i]);
        }
    }

}
