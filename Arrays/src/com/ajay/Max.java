package com.ajay;

public class Max {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        System.out.println(max(arr,0,1));
    }
    static int max(int[] a,int start,int end){
        int max=a[start];
        for(int i=start+1;i<=end;i++){

            if (max<a[i]){
                    max=a[i];
            }

        }
        return max;
    }
}
