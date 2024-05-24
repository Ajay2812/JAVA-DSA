package com.ajay;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={2,3,6,7,8,9};
        reverse(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] a,int index1,int index2){
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
    }
    static void reverse(int[] a){
        int start=0;
        int end=a.length-1;
        while(start<end){
            swap( a, start,end);
            start++;
            end--;
        }

    }
}
