package com.ajay;

import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        String name="nishith";
        char target='h';
        System.out.println(stringsearch(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean stringsearch(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        //for(int i=0;i<str.length();i++){
            //if(target==str.charAt(i)){
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }


}
