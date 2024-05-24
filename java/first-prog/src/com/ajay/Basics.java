package com.ajay;
import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter a number: ");
        float tempC=input.nextFloat();
        float tempF=(tempC*9/5)+32;
        System.out.println(tempF);

    }
}
