package com.ajay;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = in.nextInt();
        int ans=0;
        while (n > 0) {
            int r = n % 10;
            //System.out.print(r);
            n = n / 10;
            ans=ans*10+r;
        }
        System.out.println(ans);
    }
}
