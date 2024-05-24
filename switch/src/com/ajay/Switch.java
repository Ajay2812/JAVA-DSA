package com.ajay;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.next();
        switch (fruit) {
            case "mango":
                System.out.println("king of fruit");
                break;
            case "apple":
                System.out.println("sweet red fruit");
                break;
            case "orange":
                System.out.println("round fruit");
                break;
            default:
                System.out.println("enter valid fruit");
                break;
        }
    }
}
