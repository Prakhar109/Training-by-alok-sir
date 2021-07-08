package com.example.training.umeshsir;

public class MyDemoCode {
    int x = 12;

}

  class Child extends  MyDemoCode{

    public static void main(String args[]){
        Child c = new Child();
        System.out.println(c.x);
    }
}