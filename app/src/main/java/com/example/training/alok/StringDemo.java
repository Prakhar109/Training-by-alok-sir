package com.example.training.alok;
import java.util.*;
public class StringDemo {
    public static void main(String args[])
    {
        int i,vow=0,con=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
            {
                vow++;
            }
            else
            {
                con++;
            }
        }
        System.out.println("Number of vowels is" +vow);
        System.out.println("Number of consonants is" +con);

    }

}
