/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.control;

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
  public double milesPerGalon(int gasused, int milesTravel, int endMiles, int startMiles){

        if (startMiles == 0){
         return -1;
    }
        if (endMiles == 0){
        return 1;
    }
        if (gasused == 0){
        return -1;
    }
   milesTravel = endMiles - startMiles;
   int milesPerGalon = milesTravel / gasused;
   //Return miles travel per gallons.
   return milesPerGalon;
   
   
        }

}
    






