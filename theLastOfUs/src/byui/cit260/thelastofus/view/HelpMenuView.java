/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

import byui.cit260.thelastofus.control.GameControl;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author moebi
 */
public class HelpMenuView {
    private final String menu;
    
    
public HelpMenuView(){
    this.menu = "\n"
               + "\n-------------------------------------------------"
               + "\n|                Help Menu                      |"
               + "\n-------------------------------------------------"
               + "\nG - What is the goal of the game?                "
               + "\nM - How to move                                  "
               + "\nT - Estimating the amount of resources           "
               + "\nJ - Harvesting resources                         "
               + "\nD - Delivering resources to warehouse            "
               + "\nQ - Quit  (Run Cry Baby....)                     "
               + "\n-------------------------------------------------";
}

    /**
     * display the help menu view
     */
    public void displayHelpMenuView() {
        boolean done = false;//set flag to not done
         do{
            //prompt for and get the input
           String menuOption = this.getMenuOption();
   
  if (menuOption.toUpperCase().equals("Q"))
    //user wants to quit
   return; //exit the game
     //do the action and display the next view
     done = this.doAction(menuOption);
     
        } while(!done);
}

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile keyboard
        String value = ""; //get input
        boolean valid = false; //initialize to false
        while(!valid){ //loop while not valid
        System.out.println("\n" + this.menu);
        value = keyboard.nextLine(); //get next line typed in
        value = value.trim(); //trim out leading/trailing blanks
        if(value.length() < 1){ //value is blank
            System.out.println("\nInvalid value: value cannot be blank");
            continue;        
        }
        break; // end loop
        }
        return value; //return value entered
    }
    
    private boolean doAction(String choice){
        choice = choice.toUpperCase();
        
        switch (choice){
            case "G": //What is the goal of the game?
                this.whatIsTheGoalOfTheGame();
                break;
            case "M": //How to move
                this.howToMove();
                break;
            case "T": //Estimating the amount of resources 
                this.estimatingTheAmountOfResources();
                break;
            case "J": //Harvesting resources
                this.harvestinGresources();
                break;
            case "D": //Delivering resources to warehouse
                this.deliveringResourcesToWarehouse();
                break;
            case "Q": //Quit  (Run Cry Baby....)
                this.quitRunCryBaby();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
        
     private void startNewGame() {
        //start new game
        GameControl.createNewGame(TheLastOfUs.getPlayer());
        //display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void restartExistingGame() {
        System.out.println("*** restartExistingGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }

    private void whatIsTheGoalOfTheGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void howToMove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void estimatingTheAmountOfResources() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void harvestinGresources() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deliveringResourcesToWarehouse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void quitRunCryBaby() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
