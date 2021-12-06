package com.example.first;

import java.io.Console;



public class UseCart {
    public static void main(String[] args) {
        ShoppingC cart = new ShoppingC();
        System.out.println("Welcome to your shopping cart!");
        Console cons = System.console();
        while(!"stop".equals(cons)){
            String j = cons.readLine(">").toLowerCase();
            
            //System.out.println(j);
            String[] k = j.split(" , |, |,|  | ");

             /* for(String i:k){
                System.out.println(i);
            }  */
            //System.out.println(k[0]);
            if (k[0].equals("list")){
                System.out.println(cart.GetContent());
            }else if(k[0].equals("add")){
                //check if in cart
                for(int i=1;i<k.length;i++){
                    if(cart.InCart(k[i])==true){
                        System.out.printf("You have %s in your cart\n", k[i]);
                    }else{
                        //add items here
                        cart.AddItem(k[i]);
                        System.out.printf("%s added to cart\n", k[i]);
                        
                    }
                }
            }else if(k[0].equals("delete")){
                //check if in cart
                if(cart.InCart(cart.ItemName(Integer.valueOf(k[1])-1))==false){
                    System.out.println("Incorrect Item Index");
                }else{
                    System.out.printf("%s removed from cart\n", cart.ItemName(Integer.valueOf(k[1])-1));
                    cart.RemoveItem(cart.ItemName(Integer.valueOf(k[1])-1),Integer.valueOf(k[1])-1);
                    
                }
            }else if(k[0].equals("size")){
                System.out.println(cart.CSize());

            }else if("stop".equals(j)){
                break;
            }else{
                System.out.println("Command not recognised!");
            }


            
          
        
        }
        System.out.println("Thanks for shopping with us!");
    }
}