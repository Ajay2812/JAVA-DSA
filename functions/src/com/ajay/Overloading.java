package com.ajay;

public class Overloading {
    public static void main(String[] args) {
        int ans=func(20,30);
        System.out.println(ans);
    }
    static int func(int a,int b){
        System.out.println("it runs first one");
        return a+b;
    }
    static int func(int a,int b,int c){
        System.out.println("second one");
        return a+b+c;
    }
}

