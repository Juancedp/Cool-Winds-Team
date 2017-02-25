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
public class GameMenuView {
    private String menu;
    public GameMenuView(){
        this.menu = "\nR – Search for resources"
                + "\nV - View map "
                + "\nE - Explore Location "
                + "\nM – Move to new location "
                + "\nH – Check your health conditions "
                + "\nQ – Save and Quit Game";
        
    }
    

    public void displayMenu() {
         boolean done = false;
        //set flag to not done
        do{//prompt for and get the input
            String menuOption = this.getMenuOption();
         
  if (menuOption.toUpperCase().equals("Q"))
      //user wants to quit
      // saveGame();
   return; //exit the game
     //do the action and display the next view 
     done = this.doAction(menuOption);
        }
 while (!done); 
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile keyboard
        String value = "";//get input
        boolean valid = false; //initialize to false
        while(!valid){ //loop while not valid
        System.out.println("\n"+this.menu);
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice){
            case "R": //search for resources
                this.searchResources();
                break;
            case "V": //view the map
                this.viewMap();
                break;
            case "E": //explore current location
                this.explore();
                break;
            case "M": //move to new location
                this.moveLocation();
                break;
            case "H": //check health conditions
                this.healthCheck();
                break;
           
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void searchResources() {
        System.out.println("*** searchResources function called ***");
    }

    private void viewMap() {
        System.out.println("*** viewMap function called ***");
    }

    private void explore() {
        System.out.println("*** explore function called ***");
    }

    private void moveLocation() {
        DifferentLocationView moveView = new DifferentLocationView();
        moveView.displayMenu();
    }

    private void healthCheck() {
        System.out.println("*** healthCheck function called ***");
    }
    }
    

