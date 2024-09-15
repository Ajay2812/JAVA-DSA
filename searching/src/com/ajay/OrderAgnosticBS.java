package com.ajay;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={90,80,70,65,55,46,34,23,12};
        int[] arr1={1,2,4,6,12,34,56,67,78,89,90};
        int target=8;
        int ans=orderagnosticbs(arr1,target);
        System.out.println(ans);
    }
    static int orderagnosticbs(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean Asc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(Asc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
