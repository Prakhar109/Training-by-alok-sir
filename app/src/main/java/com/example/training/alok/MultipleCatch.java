package com.example.training.alok;
import java.util.*;
public class MultipleCatch {
    public static void main(String[] args)
    {
        int x,y;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter your first number");
            x = sc.nextInt();
            System.out.println("Enter your second number");
            y = sc.nextInt();

            int z = x / y;
            System.out.println("z = " +z);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("A number cannot be divided by 0, Illegal operation in Java");
            System.out.println("Exception thrown: " +ae);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Invalid data types are entered, number must be an integer.");
            System.out.println("Exception thrown: " +nfe);
        }
        catch(RuntimeException re)
        {
            System.out.println("Exception thrown: " +re);
        }
        finally {
            System.out.println("Inside the finally block");
        }
        System.out.println("Out of try-catch block");
    }
}
