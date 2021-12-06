package com.example.ForAssign1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Console;

public class ShopInter {
    
    public static void main(String[] args) {
        
        ShopCart cart1= new ShopCart();
        System.out.println("Welcome to your shopping cart!\n COMMAND LIST\n add <item>\n list\n remove <item number>\n stop");
        Console cons = System.console();
        while (!"stop".equals(cons)) {
            String input1 = cons.readLine(">");
            String[] inputp = input1.split(" , |, |,|  | ");
            //convert to arraylist
            //List<String>inputA = new ArrayList<String>(Arrays.asList(inputp));
                
        ArrayList<String> inputA = new ArrayList<String>();
        //for(String s: inputp){System.out.println(s);}             //check inputp passed yes
        for (String s : inputp){inputA.add(s);}
            //for(String s:inputA){System.out.println(s);}              //check input A passed yes
            if (inputA.get(0).equals("list")) {
                    if (cart1.list() == true) {System.out.println("Cart is empty");}
                    else {cart1.listcart();}
                
            }else if(inputA.get(0).equals("add")){
                //cart1.test2("apple");
                cart1.addCart(inputA);                             //eheck if similar if similar bread else add item
 //               cart1.test1(inputA);                                  //test if input A is read
            }else if(inputA.get(0).equals("remove")){
                String rm1 = inputA.get(1);
                try{
                int rm = Integer.parseInt(rm1);
                cart1.rmCart(rm-1);}
                catch(Exception e){System.out.println("Please type in remove format 'remove <item index>'");}
            }else if(inputA.get(0).equals("stop")){return;}       
            
            
            else {System.out.println("Invalid Input");;}
               
        }
    }
    
}
