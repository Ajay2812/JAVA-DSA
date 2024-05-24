package com.ajay.proprties.inheritance;

public class Main {
    public static void main(String[] args) {
        //Box box1=new Box(20);
        //System.out.println(box1.l);
        //BoxWeight box3=new BoxWeight(3,7);
        //System.out.println(box3.side + " " + box3.weight);
        BoxPrice box=new BoxPrice(20,23,400);
        System.out.println(box.l+" "+box.weight+" "+box.cost);
        BoxPrice box1=new BoxPrice(box);
        System.out.println(box1.cost);
    }
}
