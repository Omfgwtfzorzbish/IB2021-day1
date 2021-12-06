package com.example.tutorial;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    
    List<String> cart= new ArrayList<>();
  
    public int cartNos(){
      return cart.size();
  }
    public String listCart(){
      return"";
  }  

  public void addItem(String item){
        cart.add(item);
  }

  public String deleteItem(int i){
      if(i >=cart.size()){ return "out of bounds";}
    if(!cart.isEmpty()) {cart.remove(i);}
    cart.remove(i);
    return "Item Removed";
}
}
