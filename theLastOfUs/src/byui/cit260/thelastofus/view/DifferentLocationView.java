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
public class DifferentLocationView {
    String prompt = "\nEnter the distance you want to travel:";
    String promptTwo = "\nEnter the amount of resources:";
     public void displayMenu() {
         boolean done = false;
        //set flag to not done
        do{//prompt for and get the input
            double distance = this.getDistance();
            double resources = this.getResources();
    double time = MapControl.differentLocation(distance, resources);
     System.out.println("You made it. It took "+time+" hours");
     done = true;
        }
 while (!done); 
    }

    private double getDistance() {
        Scanner keyboard = new Scanner(System.in); //get infile keyboard
        String value = "";//get input
        boolean valid = false; //initialize to false
        while(!valid){ //loop while not valid
        System.out.println("\n"+this.prompt);
        value = keyboard.nextLine(); //get next line typed in
        value = value.trim(); //trim out leading/trailing blanks
        if(value.length()< 1 ){//value is blank
           System.out.println("\nInvalid value: value cannot be blank");
           continue;
          
        }
        break; //end loop
        }
        double dist = Double.parseDouble(value);
        return dist; //return value entered
    }
    private double getResources() {
        Scanner keyboard = new Scanner(System.in); //get infile keyboard
        String value = "";//get input
        boolean valid = false; //initialize to false
        while(!valid){ //loop while not valid
        System.out.println("\n"+this.promptTwo);
        value = keyboard.nextLine(); //get next line typed in
        value = value.trim(); //trim out leading/trailing blanks
        if(value.length()< 1 ){//value is blank
           System.out.println("\nInvalid value: value cannot be blank");
           continue;
          
        }
        break; //end loop
        }
        double resc = Double.parseDouble(value);
        return resc; //return value entered
    }
    
}
