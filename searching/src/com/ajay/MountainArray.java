package com.ajay;

public class MountainArray{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=6;
        int result=search(arr,target);
        System.out.println(result);
    }
    static int search(int[] arr,int target){
        int ans=peak(arr);
        int sol=orderagnosticbs(arr,target,0,ans);
        if(sol!=-1){
            return sol;
        }
        return  orderagnosticbs(arr,target,ans+1,arr.length-1);
    }
    static int peak(int[] arr){

        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;

    }
    static int orderagnosticbs(int[] arr,int target,int start,int end){

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
