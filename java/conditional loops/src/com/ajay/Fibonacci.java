package com.ajay;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter a range: ");
        int n=input.nextInt();
        int a=0;
        int b=1;
        int c=2;
        while(c<=n){
            int temp=b;
            b=b+a;
            a=temp;
            c++;
        }
        System.out.println(b);

    }

}
