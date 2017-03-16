/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

import java.util.Scanner;
import byui.cit260.thelastofus.control.MapControl;
/**
 *
 * @author Karl
 */
public class DifferentLocationView extends View {
    
    public DifferentLocationView(){
    super("\nEnter the distance you want to travel:");
    }

    /**
     *
     * @param value
     * @return
     */
    @Override
     public boolean doAction(String value) {
         double distance = Double.parseDouble(value);
            
    double[] timeDistance = MapControl.differentLocation(distance, 5);
     System.out.println("You made it. It took "+timeDistance[0]+" hours"
             + "\nTotal Distance traveled : "+timeDistance[1]);
 return true;
    }

    

}
