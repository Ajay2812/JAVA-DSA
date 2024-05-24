//here we are creating new object rather than modifing it.
// so initially the defined name will print even though namechange will happen inside function bt not outside the func
// hence swaping or name change won't take place


package com.ajay;
public class Swap {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        //swap(a,b);
        //System.out.println(a+" "+b);
        String name="ajay";
        //changename(name);
        {
            name="kranthi";
        }
        System.out.println(name);
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

    }
    static void changename(String name){
        name="tharun";
    }
}
