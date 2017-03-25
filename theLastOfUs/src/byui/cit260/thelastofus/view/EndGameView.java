/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

import byui.cit260.thelastofus.control.GameControl;
import thelastofus.TheLastOfUs;

/**
 *
 * @author Karl
 */
public class EndGameView extends View{
    EndGameView(){
        super("Well done! You have survived. Now you can share the cure."
                + "\nS - Save game"
                + "\nA - play again"
                + "\nM - Main Menu"
                + "\nQ - Quit game");
    }
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();
        switch (value){
                case "S":
                    this.console.println("\nEnter the file name to save to");
        String filePath = this.getInput();
        try{
            //save game to specified file
            GameControl.saveGame(TheLastOfUs.getCurrentGame(), filePath);
        }catch (Exception e){
            ErrorView.display("MainMenuView",e.getMessage());
        }
                    
                    break;
                case "A":
                    IntroductionView intro = new IntroductionView();
                    intro.display();
                    break;
                case "M":
                    MainMenuView mainMenuView = new MainMenuView();
                     //display main menu
                     mainMenuView.display();
               
    }
        return false;
    }
}
