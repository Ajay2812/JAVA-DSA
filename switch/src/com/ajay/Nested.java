package com.ajay;
import java.util.Scanner;
public class Nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid=in.nextInt();
        String dept=in.next();

        switch (empid) {
            case 1:
                System.out.println("ajay");
                break;
            case 2:
                System.out.println("kranthi");
                break;
            case 3:
                System.out.println("empid 3");

                switch (dept) {
                    case "it":
                        System.out.println("it");
                        break;
                    case "management":
                        System.out.println("management");
                        break;
                    default:
                        System.out.println("invalid dept");
                        break;
                }
                break;
            default:
                System.out.println("invalid id");
                break;
        }
    }
}
