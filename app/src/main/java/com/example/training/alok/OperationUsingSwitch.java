package com.example.training.alok;



import java.util.Scanner;

public class OperationUsingSwitch {
    public static void operation(int l1, int l2, char operator) {
        switch (operator) {
            case '+':
                System.out.println(l1 + l2);
                break;

            case '-':
                System.out.println(l1 - l2);
                break;

            case '*':
                System.out.println(l1 * l2);
                break;

            case '/':
                System.out.println(l1 / l2);
                break;

            default:
                System.out.println("Entered wrong choice");
                break;
        }
    }

    public static void main(String[] args) {
        int num1=0,num2=0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number");
            num1 = sc.nextInt();
            System.out.println("Enter the second number");
             num2 = sc.nextInt();
        }
        catch(Exception e)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the operator to perform operation");
        char l3 = sc.next().charAt(0);
        operation(num1, num2, l3);
    }
        finally {
            System.out.println("This code is out of block");
        }
    }
}