/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.control;

import byui.cit260.thelastofus.exceptions.ItemControlException;
import java.util.ArrayList;

/**
 *
 * @author Karl
 */
public class ItemControl {
    
    private static ArrayList<Double>itemsUsed = new ArrayList<>();
   
   public static double additemsUsed (double items){
       itemsUsed.add(items);
       double total = 0;
       for (double itemsUsed :itemsUsed){
           total += itemsUsed;
       }
       return total;
   }
    public String Itemtype ( int gun, int stone, int knife)
        throws ItemControlException{
        
        if (gun == 0 ) { 
               throw new ItemControlException(" you out of gun bullets");
        }
        if (stone == 0) {
                throw new ItemControlException("you don't have more stones");
        }
        if (gun == 0 && stone ==0){
                throw new ItemControlException("you need to use the knife");
        }
return "gun";
}
    
}
