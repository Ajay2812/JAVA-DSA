package com.ajay;

public class Q1 {
    public static void main(String[] args) {
        int[] arr={2,3,2,6,4,3,4};
        System.out.println(findunique(arr));
    }
    static int findunique(int[] arr){
        int unique=0;
        for(int num:arr){
            unique^=num;
        }
        return unique;

    }
}
