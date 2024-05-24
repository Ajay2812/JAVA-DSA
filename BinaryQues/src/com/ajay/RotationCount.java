package com.ajay;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr={6,7,1,2,3,4,5};
        System.out.println(Count(arr));
    }
    static int Count(int[] arr){
        int pivot=count(arr);
        return pivot+1;
    }
    //without duplicates
    static int count(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int duplicatescount(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (start < mid && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if(arr[start]>arr[start+1]){
                    return start;
                }

                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;

            } else if (arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
