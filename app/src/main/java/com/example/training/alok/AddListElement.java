package com.example.training.alok;

import java.util.ArrayList;
import java.util.List;

public class AddListElement {
    public static int addElement( List<Integer> l1 )
    {
        int sum=0;
        for(int i = 0; i< l1.size(); i++)
            sum=sum+l1.get(i);
        return sum;
    }
    public static void main(String[] args)
    {
        List<Integer> l1=new ArrayList<>();
        l1.add(5);
        l1.add(8);
        l1.add(5);
        l1.add(7);
        System.out.println(addElement(l1));
    }
}
