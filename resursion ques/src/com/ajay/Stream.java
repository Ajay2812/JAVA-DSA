package com.ajay;

public class Stream {
    public static void main(String[] args) {
        //skip("","baccdah");
        System.out.println(skipcombo("abcdappledfg"));
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skipcombo(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipcombo(up.substring(5));
        }
        else{
            return up.charAt(0)+skipcombo(up.substring(1));
        }
    }



}
