package com.ajay;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=in.nextInt();
        ArrayList<Integer> list=new ArrayList<>(10);
        for(int i=0;i<n;i++){
            list.add(in.nextInt());
        }
        System.out.println(list);
        System.out.println(list.get(3));

    }
}
