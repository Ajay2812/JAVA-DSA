package com.ajay;

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int[][] arr={
                {2,3,5},
                {10,12,13,14},
                {70,40,36},
                {18,19}

        };
        int target=6;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int rows=0;rows<arr.length;rows++){
            for(int col=0;col<arr[rows].length;col++){
                if(arr[rows][col]==target){
                    return new int[]{rows,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
