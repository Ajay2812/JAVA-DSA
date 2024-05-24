package com.patterns;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={4,2,1,3};
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int i,int j){
        if(i==0){
            return;
        }
        if(j<i){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
            sort(arr,i,j+1);
        }else{
            sort(arr,i-1,0);
        }
    }
}
