package com.ajay;
import java.util.Scanner;
public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = in.nextInt();

        if (isprime(n)) {
            System.out.println("yes it is prime ");

        } else {
            System.out.println("not a prime");
        }

    }
    public static boolean isprime(int n)
    {
        if (n<=1)
        {
            return false;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%2==0)
                {
                    return false;
                }
            }

        }
        return true;
    }
}
