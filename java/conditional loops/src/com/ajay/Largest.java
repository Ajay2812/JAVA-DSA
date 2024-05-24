package com.ajay;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner n =new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        int c=n.nextInt();
        if ((a>b) && (a>c)){
            System.out.println(a + " 2is greater");

        }
        else if((b>a) && (b>c)){
            System.out.println(b +" is greater");
        }
        else{
            System.out.println(c + " is greater");
        }
    }
}
