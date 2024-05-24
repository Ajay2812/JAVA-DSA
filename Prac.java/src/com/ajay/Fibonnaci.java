package com.ajay;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    static int fib(int n){
        int a=0;
        int b=1;
        int c=2;
        while(c<=n){
            int temp=b;
            b=a+b;
            a=temp;
            c++;
        }
        return b;
    }
}
