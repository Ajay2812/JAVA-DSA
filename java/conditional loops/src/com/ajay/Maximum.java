package com.ajay;
import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner n =new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        int c=n.nextInt();
        int max=a;
        if (b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("max= "+max);
    }
}
