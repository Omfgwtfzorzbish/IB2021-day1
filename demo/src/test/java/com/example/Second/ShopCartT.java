package com.example.Second;

import java.util.ArrayList;

public class ShopCartT {
    public static void main(String[] args) {
    boolean isdiff=false;

        ArrayList<String> cart = new ArrayList<String>();
            cart.add("apple");cart.add("pear");cart.add("string");
    ArrayList<String> item = new ArrayList<String>();
                item.add("orange");item.add("cucumber");item.add("salad");
        for (String s:item.subList(1, item.size())){
            for(String x:cart){
                if(s.equals(x)){
                    isdiff=false;
                    break;
                } else {isdiff=true;
                cart.add(s);
                System.out.println(s +"has been added");
                }
            }
        if(isdiff==false){
            System.out.println("item is already in cart");
        }
        }
        for(String s:cart){System.out.println(s);}
    }
}
