package com.ajay;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String s1="hello world";
        String s2=new String("hello");
        String s3="123";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        System.out.println(s1.trim().length());
        //System.out.println(s1.length());
        char[] a=s1.toCharArray();
        System.out.println(s1);
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.lastIndexOf("o"));
        System.out.println(s1.substring(2,5));//spaces are also a character
        System.out.println(Arrays.toString(s1.split(" ")));
        System.out.println(s1.charAt(6));
        System.out.println(s1.replace("hello","hi"));
        System.out.println(Integer.valueOf(s3));
        System.out.println(s1.replaceAll("hello","heyy"));
    }
}
