package com.ajay;

public class Q7 {
    public static void main(String[] args){
        System.out.println(lcm(9,17));

    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a) ;
    }
    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}
