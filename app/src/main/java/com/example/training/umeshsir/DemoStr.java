package com.example.training.umeshsir;

public class DemoStr {
    public static void main(String args[]) {
        String s="Prakhar Ghatia";
        String s1=s.toLowerCase();
        String s2=s.toUpperCase();
        String[] s3=s.split(" ");
        for(String t:s3)
        {
            System.out.println("Done"+t);
        }

        int s4=s.length();
        String s5=s.replace('a','A');
        String s6=s.replace("Prakhar", "PRAKHAR");
        Boolean s7=s.contains("Prakhar");
        String s8=s.replaceFirst("Prakhar","PrakhaR");
       // String s9=s.replace();
        //System.out.println(s1);
        //System.out.println(s2);
        //System.out.println(s3);
        //System.out.println(s4);
        //System.out.println(s5);
        //System.out.println(s6);
        //System.out.println(s7);
        //System.out.println(s8);



    }
}
