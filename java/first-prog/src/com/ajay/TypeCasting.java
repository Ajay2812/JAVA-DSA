package com.ajay;
//import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        //Scanner input=new Scanner(System.in);
        byte b=42;
        char c='a';
        int i=5000;
        float f=5.67f;
        double d=0.12345;
        short s=1024;
        double result=(f*c)+(i/b) -(d*s);
        System.out.println((f*c)+ " " + (i/b)+  " " +(d*s));
        System.out.println(result);
    }
}
