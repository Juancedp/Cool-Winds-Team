/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import thelastofus.TheLastOfUs;

/**
 *
 * @author Karl
 */
public abstract class View implements ViewInterface{
    protected String displayMessage;
    protected final BufferedReader keyboard= TheLastOfUs.getInFile();
    protected final PrintWriter console = TheLastOfUs.getOutFile();
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
        
        String value = null;//get input
        boolean valid = false; //initialize to false
        while(!valid){ try {
            //loop while not valid
            this.console.println("\n"+this.displayMessage);
            value = this.keyboard.readLine(); //get next line typed in
            value = value.trim(); //trim out leading/trailing blanks
            if(value.length()< 1 ){//value is blank
                this.console.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break; //end loop
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),"error reading input:"+ex.getMessage());
            }
        }
        return value; //return value entered
    }
}
