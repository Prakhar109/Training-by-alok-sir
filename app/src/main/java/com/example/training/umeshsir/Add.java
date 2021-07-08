package com.example.training.umeshsir;

// with parameter and with return type
public class Add {
        public static void main(String[] args)
        {
            int x=12,y=14, sum;
            sum = addTwo(x,y);
            System.out.println("Sum is "+sum);
        }
        public static int addTwo(int a, int b)
        {
            int sum = a + b;
            return sum;
        }
    }
