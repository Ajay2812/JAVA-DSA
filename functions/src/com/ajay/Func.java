package com.ajay;
import java.util.Scanner;
public class Func {
    public static void main(String[] args) {
        int ans=sum2(20,30);
        System.out.println(ans);
    }
    static int sum(){
        Scanner in =new Scanner(System.in);
        System.out.println("enter num1: ");
        int a=in.nextInt();
        System.out.println("enter num2: ");
        int b=in.nextInt();

        //System.out.println("sum= "+sum);
        return a+b;
    }

    static int sum2(int a,int b){
        return a+b;
    }
}
