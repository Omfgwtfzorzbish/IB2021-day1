package com.example.test;
import org.junit.Test;

public class CartTest {
    @Test
     public void testAdd(){
         CartTest cart = new CartTest();
         cart.addItem("durian");
         cart.addItem("mango");
         assertTrue(cart.cartNos() ==2);
         System.out.println("assertion size =2");
     }
     public void testDelete(){
        CartTest cart = new CartTest();
        cart.addItem("durian");
        cart.addItem("mango");
        cart.deleteItem(1);
        assertTrue(cart.cartNos() ==2);
        System.out.println("assertion size =1 after delete");
     }
}
