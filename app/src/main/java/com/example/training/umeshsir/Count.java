package com.example.training.umeshsir;

import java.util.*;
public class Count {
    public static void main(String args[])
    {
        Scanner sc=new Scanner((System.in));

        int k=0;
        System.out.println("Enter a string");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                k++;
            }
        }
        System.out.println("Number of words in string is "+k);
    }
}
