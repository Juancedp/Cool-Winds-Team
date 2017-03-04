/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

import java.util.Scanner;

/**
 *
 * @author Karl
 */
public abstract class View implements ViewInterface{
    protected String displayMessage;
    
    public View(){
    }
    public View(String message){
        this.displayMessage = message;
    }
    @Override
    public void display(){
         boolean done = false;
        //set flag to not done
        do{//prompt for and get the input
            String value = this.getInput();
         
  if (value.toUpperCase().equals("Q"))
      //user wants to quit
   return; //exit the game
     //do the action and display the next view 
     done = this.doAction(value);
        }
 while (!done); 
    }
    @Override
    public String getInput(){
        Scanner keyboard = new Scanner(System.in); //get infile keyboard
        String value = null;//get input
        boolean valid = false; //initialize to false
        while(!valid){ //loop while not valid
        System.out.println("\n"+this.displayMessage);
        value = keyboard.nextLine(); //get next line typed in
        value = value.trim(); //trim out leading/trailing blanks
        if(value.length()< 1 ){//value is blank
           System.out.println("\nInvalid value: value cannot be blank");
           continue;
        }
        break; //end loop
        }
        return value; //return value entered
    }
}
