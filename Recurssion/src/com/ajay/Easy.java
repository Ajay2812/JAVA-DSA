package com.ajay;

public class Easy {
    public static void main(String[] args) {
       // revfunc(5);
        //System.out.println(fact(6));
        System.out.println(sum(123456789));

    }
    static void func(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        func(n-1);
    }
    static void revfunc(int n){
        if(n==0){
            return;
        }

        revfunc(n-1);
        System.out.println(n);
    }
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10+sum(n/10);
    }
    static void revnum(int n){
        if(n==0){
            return;
        }
        System.out.println(n%10);
    }
}
