package com.ajay;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(2,4,"c","d");
    }
    static void func(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));
    }
}
