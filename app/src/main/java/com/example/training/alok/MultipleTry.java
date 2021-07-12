package com.example.training.alok;

public class MultipleTry {

        public static void main(String[] args) {
            int a[]=new int[5];

            try{
                a[5]=30/0;
                //System.out.println(a[10]);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Arithmetic Exception occurs");
            }
            try{
                System.out.println(a[10]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ArrayIndexOutOfBounds Exception occurs");
            }
            catch(Exception e)
            {
                System.out.println("Parent Exception occurs");
            }
            System.out.println("rest of the code");
        }
    }
