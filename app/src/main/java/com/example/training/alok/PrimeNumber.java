package com.example.training.alok;
import java.util.*;
public class PrimeNumber {
    public static void main(String args[])
    {
        int temp = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number");
        int start=sc.nextInt();
        System.out.println("Enter the last number");
        int last=sc.nextInt();
        //System.out.println(start+" "+last);
        for(int i=start;i<=last;i++)
        {
            temp=0;
            if(i<2)
            {
                continue;
            }
            for(int j=2;j<=i/2;j++)
            {
                if (i%j==0)
                {
                    temp++;
                    break;
                }
            }
            if( temp == 0)
                System.out.println(i);

        }
        //System.out.println(start+" "+last);
    }

}
