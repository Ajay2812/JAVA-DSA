package com.ajay;

public class Q4 {
    public static void main(String[] args) {
        int n=40;
        boolean[] prime=new boolean[n+1];
        //System.out.println(prime[0]);
        seive(n,prime);
    }
    static void seive(int n,boolean[] prime){
        for(int i=2;i*i<=n;i++){
            if(!prime[i]){
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!prime[i]){
                System.out.print(i+ " ");
            }
        }
    }
}

