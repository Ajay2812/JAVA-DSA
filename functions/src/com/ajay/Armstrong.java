package com.ajay;
import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        //System.out.print("enter a number: ");
        //int n=in.nextInt();
        //boolean ans=isArmstrong(n);
        //if(isArmstrong(n)){
          //  System.out.println("yes");
        //}
        //else{
          //  System.out.println("no");
        //}
        for (int i=0;i<=1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }

    }
    static boolean isArmstrong(int n)
        {
        int num=n;
        int sum=0;
        while(n>0)
        {
            int r=n%10;

            sum+=Math.pow(r,3);

            n=n/10;

        }
    return sum == num;
    }
}
