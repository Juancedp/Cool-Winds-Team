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
 * @author Karl
 */
public class MainMenuView {
        private String menu;
    

    public MainMenuView() {
        this.menu = "\n------------------------------------"
+"\n    ▄▀▀▀█▀▀▄  ▄▀▀▄ ▄▄   ▄▀▀█▄▄▄▄     ▄▀▀▀▀▄    ▄▀▀█▄   ▄▀▀▀▀▄  ▄▀▀▀█▀▀▄      ▄▀▀▀▀▄   ▄▀▀▀█▄ ▄▀▀▄     ▄▀▀▄  ▄▀▀▀▀▄     \n" +
"          █    ▐  █     █    ▄▀ ▐  ▄▀   ▐   █       █  ▐ ▄▀ ▀▄ █  █   ▐ █        █  ▐     █      █ █  ▄▀  ▀▄       █      █       █      ▐     \n" +
"     ▐   █    ▐  █▄▄▄█     █▄▄▄▄▄    ▐   █             █▄▄▄█      ▀▄   ▐       █         █      █ ▐ █▄▄▄▄        ▐       █    █    ▀▄       \n" +
"         █        █     █     █    ▌           █           ▄▀      █ ▀▄    █          █          ▀▄    ▄▀  █    ▐         █       █    ▀▄     █      \n" +
"       ▄▀        ▄▀  ▄▀    ▄▀▄▄▄▄         ▄▀▄▄▄▄▄▄▀ █   ▄▀   █▀▀▀        ▄▀             ▀▀▀▀    █               ▀▄▄▄▄▀        █▀▀▀ ▄ ▄ ▄ \n" +
"      █          █   █        █    ▐         █         ▐   ▐    ▐     █                                       █                                 ▐          \n" +
"     ▐          ▐   ▐        ▐              ▐                          ▐                                       ▐                                    \n" 


                + "\n               Zombie Menu"
                + "\nN - Start new game "
                + "\nR - Restart existing game"
                + "\nH - Help! I keep dying! "
                + "\nE – Exit  (you wimp...) "
                + "\n--------------------------------------";
    }
        
        
        
     public void displayMainMenuView() {
        boolean done = false;
        //set flag to not done
        do{//prompt for and get the input
            String menuOption = this.getMenuOption();
         
  if (menuOption.toUpperCase().equals("E"))
      //user wants to quit
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
            case "N": //start new game
                this.startNewGame();
                break;
            case "R": //restart existing game
                this.restartExistingGame();
                break;
            case "H": //display help menu
                this.displayHelpMenu();
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
    
}
