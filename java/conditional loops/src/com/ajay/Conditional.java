package com.ajay;
import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("enter the number: ");
        int n=input.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(i + " ");
            i++;
        }
    }
}
