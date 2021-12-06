package com.example.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingC {
        public ShoppingC(){};  //instantiate shoppinc cart
        private Integer Loc = 0;
        private Integer CartSize = 0;
        private String temp ="";
        private Map<String,Integer> map = new HashMap<String,Integer>();
        private List<String> l = new ArrayList<String>();
        public void AddItemDict(String i, Integer j){
            map.put(i,j);               //public method to add map
        }
        public boolean InCart(String i){      //public method to check if item is in cart
            if(map.containsKey(i)==true){
            return true;
            }else{
                return false;
            }
        }
        public void AddItem(String i){          //public method to add item
            l.add(i);
            map.put(i,1);
        }
        public Integer CSize(){
            return l.size();
        }
        public String GetContent(){
            temp="";
            CartSize=l.size();
            if(CartSize==0){
                return "Your cart is empty";
            }else{
                //return "a";
                for(int i=0;i<l.size();i++){
                    if (i+1==l.size()){
                    temp+=((i+1) +": " + l.get(i)).toString();
                    //return temp;
                    }else{
                    temp+=((i+1) +": " + l.get(i)).toString()+"\n";
                    }
                }
            return temp;
            }
        }
        public void RemoveItem(String i, Integer j){
            map.remove(l.get(j));
            l.remove(i);
        }
        public Integer IndexLoc(String j){
            Loc=0;
            for(int i=0;i<l.size();i++){
                if(l.get(i).equals(j)){
                    Loc=i;
                }
            }
            return Loc;
        }
        public String ItemName(Integer i){
            return l.get(i);
        }
        
}