package com.example.ForAssign1;
import java.util.collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopCart{
    public ShopCart(){};
    public ArrayList<String> cart = new ArrayList<String>();
    private Boolean isdiff=true;
    
    public Boolean list(){
        if (cart.size()==0) {
            return true;
        } else { return false;}

    } 

    public void listcart(){
        for(int i = 0; i < cart.size(); i++) {   
            String j=String.valueOf(i+1); 
        System.out.print(j + ". " +cart.get(i)+"\n");}
    }
    public void addCart(ArrayList<String> item){
        for(String s:item.subList(1, item.size())){ 
            for(String x:cart){
                if(x.equals(s)){
                System.out.println("Duplicate item, Please re-enter input"); return;}else{continue;}
            }

        for (String z:item.subList(1, item.size())){                //iteates over every string in array
            cart.add(z);
            System.out.println(z +" has been added");
        }
        return;
        }
    }
    
    public void rmCart(int itemIndx){
        String s1=cart.get(itemIndx);
        cart.remove(itemIndx);
        System.out.println(s1 +" has been removed");
    }
    
    
    
    /*public void addItem(ArrayList<String> item){              //in DEv cannot nest array
        for (String s:item.subList(1, item.size())){
            String s1=s;
          for(String x:cart){
              if(x.equals(s1)){
                    isdiff=false;
                    System.out.println("Item is already in cart");
                    break;
                } else {isdiff=true;
                cart.add(s);
                System.out.println(s +"has been added");
               }
            }
        }
    }*/
    public void test2(String z){cart.add(z);}
    public void test1(ArrayList<String> item){System.out.println(item.size());}
}