package com.ajay;
import java.util.Scanner;
public class Occurances {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=in.nextInt();
        System.out.print("enter the target: ");
        int target=in.nextInt();
        int c=0;
        while(n>0){
            int r=n%10;
            if (r==target){
                c++;
            }
            n=n/10;
        }
        System.out.println(c);
    }
}
