package com.example.training.alok;
import java.util.*;
public class Selection {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of first subject");
        int marks1=sc.nextInt();
        System.out.println("Enter the marks of second subject");
        int marks2=sc.nextInt();
        System.out.println("Enter the marks of third subject");
        int marks3=sc.nextInt();
        float percentage,total;
        total=(marks1+marks2+marks3);
        percentage=(total/300)*100;
        if(percentage>=75)
        {
            System.out.println("Selected and proceed for the next round");
        }
        else System.out.println("Not Selected....Please try next time");

    }
}
