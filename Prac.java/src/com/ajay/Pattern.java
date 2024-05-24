package com.ajay;

public class Pattern {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int col;
        for(int i=0;i<2*n;i++){
            if(i>n){
                col=2*n-i;
            }
            else{
                col=i;
            }
            for(int j=0;j<col;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
