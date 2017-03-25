/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

import java.util.Scanner;
import byui.cit260.thelastofus.control.MapControl;
import byui.cit260.thelastofus.exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
         double distance = 0;
         try {
             //parse and convert number from text to double
            
             distance = Double.parseDouble(value);
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),"\nyou must enter a valid number."
                                  +"try again or enter Q to quit");
            }
    double[] timeDistance = {0,0};
        try {
            MapControl.differentLocation(distance, 5);
        } catch (MapControlException me) {
            this.console.println(me.getMessage());
        }
     this.console.println("You made it. It took "+timeDistance[0]+" hours"
             + "\nTotal Distance traveled : "+timeDistance[1]);
     
 return true;
    }

    

}
