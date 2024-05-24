package com.ajay;
import java.util.Scanner;
public class Cases {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        char ch=n.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }

    }
}
