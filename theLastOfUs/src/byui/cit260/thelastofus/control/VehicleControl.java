/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.control;

import byui.cit260.thelastofus.exceptions.VehicleControlException;
import java.util.ArrayList;

public class VehicleControl{
    

private static ArrayList<Double>milesPerGalon = new ArrayList<>();
 public static double milesPerGalon (double miles){
         milesPerGalon.add(miles);
         double total = 0; 
         for (Double milestotal : milesPerGalon){
         total += milestotal;
         }
         return total;
 }
 /*
 * @author Karl
 */
  public double milesPerGalon(int gasused, int milesTravel, int endMiles, int startMiles) throws VehicleControlException{

        if (startMiles == 0){
         throw new VehicleControlException("Starting miles can't be 0");
    }
        if (endMiles == 0){
        throw new VehicleControlException("ending miles can't be 0");
    }
        if (gasused == 0){
        throw new VehicleControlException("gas used can't be 0");
    }
   milesTravel = endMiles - startMiles;
   int milesPerGalon = milesTravel / gasused;
   //Return miles travel per gallons.
   return milesPerGalon;
   
   
        }

}
    






