package main.java.com.stackroute.PE3;

public class ChessBoard
{
    public static void main(String[] args)
    {
        String white="WW|", black="BB|";
        System.out.println("My Chess Board");
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if((j%2==0 && i%2==0)||(j%2!=0 && i%2!=0))
                {
                    System.out.print(white);
                }
                else
                        System.out.print(black);
                }
                System.out.print("\n");
        }
    }
}
