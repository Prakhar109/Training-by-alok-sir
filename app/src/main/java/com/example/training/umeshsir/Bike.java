package com.example.training.umeshsir;

public class Bike {
    int price;
    int model;
    String name;
    static String company="HONDA";
    Bike(int x,int y, String z)
    {
        price=x;
        model=y;
        name=z;


    }
    public  void display()
    {
        System.out.println(price+" "+model+" "+name+" "+company);
    }
}
class Details{
    public static void main(String args[])
    {
        Bike p1=new Bike(500,2015,"Shine");
        Bike p2=new Bike(500,2017,"Neo");
        p1.display();
        p2.display();



    }
}

