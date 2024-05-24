package com.ajay;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,7,8,9,12,14,18};
        int target=10;
        int ans=ceiling(arr,target);
        System.out.println(ans);
    }
    // ceiling=[smaller no>=target]
    static int ceiling(int[] arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        //return arr[end+1];
        //return arr[end];  floor of a num[greatest num<=target]
        return start;

    }
}
