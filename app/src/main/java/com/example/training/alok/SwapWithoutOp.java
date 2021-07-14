package com.example.training.alok;

public class SwapWithoutOp {
    public static void main(String args[]) {
        int a = 10, b = 5;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Swap Value of a and b is "+a+" "+b);
    }
}
