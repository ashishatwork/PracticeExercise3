package main.java.com.stackroute.PE3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FrequencyOfWords
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String[] str;
        String st;
        BufferedReader br=new BufferedReader(new FileReader("data/FileDemo.txt"));
        while((st=br.readLine())!=null)
        {
            str += st.split(" ")

        }
    }
}
