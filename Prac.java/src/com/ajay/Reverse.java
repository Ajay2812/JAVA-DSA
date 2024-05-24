package com.ajay;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int ans=0;
        while(n>0){
            int r=n%10;
            ans=ans*10+r;
            n/=10;
        }
        System.out.println(ans);
    }

}
