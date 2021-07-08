package com.example.training.alok;
import java.util.*;
public class DigitSum {
    public static void main(String args[])
    {
        int digit,sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a digit");
       int s= sc.nextInt();
       while(s>0)
       {
           digit=s%10;
           sum=sum+digit;
           s=s/10;
       }
       System.out.println("Sum of the digit is "+sum);
    }
}
