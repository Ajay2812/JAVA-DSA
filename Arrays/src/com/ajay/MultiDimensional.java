package com.ajay;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensional {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[2][2];
        for(int rows=0;rows<arr.length;rows++){
            for(int col=0;col<arr[rows].length;col++){
                arr[rows][col]=in.nextInt();
            }
        }
        //for(int rows=0;rows<arr.length;rows++) {
            //for(int col=0;col<arr[rows].length;col++){
                //System.out.print(arr[rows][col]+" ");

            //}
            //System.out.println();
            //System.out.println(Arrays.toString(arr[rows]));
        Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
        //}
    }
}
