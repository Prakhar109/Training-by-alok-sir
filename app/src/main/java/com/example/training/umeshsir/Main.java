package com.example.training.umeshsir;

    public class Main
    {
        public static void main(String[] args) {
            int a[]={1,1,1,1,1,1,1,1,1,1};

            for(int i=0;i<10;i++) {
                if (i == 5){
                    a[5] = 5;
                }
                else{
                    a[i] = 2;
                }
                System.out.print(a[i] + " " );
            }
        }

}

