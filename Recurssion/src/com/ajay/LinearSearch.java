package com.ajay;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,3,5,2,5,8,13};
        //nt target=8;
        ArrayList<Integer> ans =searchallindex(arr,5,0,new ArrayList<>());
        System.out.println(ans);
    }
    static boolean search(int[] arr,int target,int i){
        if(i==arr.length){
            return false;
        }
        return arr[i]==target || search(arr,target,i+1);
    }
    static int searchindex(int[] arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        else{
            return searchindex(arr,target,i+1);
        }
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void searchallindex(int[] arr,int target,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==target) {
            list.add(i);
        }
        searchallindex(arr,target,i+1);

    }
    static ArrayList<Integer> searchallindex(int[] arr, int target, int i, ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target) {
            list.add(i);
        }
        return searchallindex(arr,target,i+1,list);

    }
}
