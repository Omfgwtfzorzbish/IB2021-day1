package com.example.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("please key in soething");;
        Scanner scan = new Scanner(System.in);
        String com = scan.next();
        
        List<String> cart = new ArrayList<>();
        cart.add("apple"); cart.add("apple"); cart.add("orange");
    
    
       /* while(!com.equals("list")||!com.equals("add")){
        System.out.println("Please use only list or add.");
        com=scan.next(); */
        while(!com.startsWith("list") && !com.startsWith("add") && !com.startsWith("delete")){System.out.println("please us only list or add.");}
        com=scan.next();
    
        if (com.equals("list"))
            System.out.println("list is" + cart);
        
        
    scan.close();
    }
}
