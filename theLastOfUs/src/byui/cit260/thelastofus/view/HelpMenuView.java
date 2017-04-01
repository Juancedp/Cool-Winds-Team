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
public class HelpMenuView extends View{
    
    
public HelpMenuView(){
            super("\n"
               + "\n-------------------------------------------------"
               + "\n|                Help Menu                      |"
               + "\n-------------------------------------------------"
               + "\nG - What is the goal of the game?                "
               + "\nM - How to move                                  "
               + "\nE - Exit  (Run Cry Baby....)                     "
               + "\n-------------------------------------------------");
}

    
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();
        
        switch (value){
            case "G": //What is the goal of the game?
                this.whatIsTheGoalOfTheGame();
                break;
            case "M": //How to move
                this.howToMove();
                break;
            
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
        
   


    private void whatIsTheGoalOfTheGame() {
        this.console.println("The goal of this game is survival.");
        
    }

    private void howToMove() {
        this.console.println("You have various abandoned vehicles to choose from,"
                + "but remember, you need resources in order to survive."
                + "Zombies don't need food, but you do.");
    }

    
    
}
