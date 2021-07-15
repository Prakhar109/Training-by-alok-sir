package com.example.training.alok;

import java.util.ArrayList;
import java.util.List;

public class SearchPage {
    public static int search(int a) {
        return (a / 10) + 1;
    }
    public static int addElement( List<Integer> l1 )
    {
        int sum=0;
        for(int i = 0; i< l1.size(); i++)
            sum=sum+l1.get(i);
        return sum;
    }

    public static List<Integer> CompareElement( List<Integer> l1 ,List<Integer> l2)
    {
        List<Integer> l3=new ArrayList<>();
        for(int i=0;i<l1.size();i++)
        {
            for(int j=0;j<l2.size();j++)
            {
                if (l1.get(i) == l2.get(j))
                    l3.add(l1.get(i));
            }
        }
        return l3;
    }

    public static void main(String args[]) {
        System.out.println(search(8));
        System.out.println(search(121));

        List<Integer> l1=new ArrayList<>();
        l1.add(5);
        l1.add(8);
        l1.add(5);
        l1.add(7);
        System.out.println(addElement(l1));


        List<Integer> l3=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l3.add(5);
        l3.add(8);
        l3.add(9);
        l3.add(6);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        System.out.println(CompareElement(l3,l2));
    }
}
