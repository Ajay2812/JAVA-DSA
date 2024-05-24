package com.ajay;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        switch (name) {
            case "ajay" -> System.out.println("Plays cricket very well");
            case "abhiram" -> System.out.println("Eats more");
            case "kranthi" -> System.out.println("Plays kabbadi very well");
            default -> System.out.println("enter valid name");
        }
    }
}
