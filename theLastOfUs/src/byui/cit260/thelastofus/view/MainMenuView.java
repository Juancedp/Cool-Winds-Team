/*
 * To change this licnse header, choose License Headers in Project Properties.
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
public class MainMenuView extends View{
       
    

    public MainMenuView() {
         super("\n------------------------------------"
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
                 + "\nS - Save game"
                + "\nH - Help! I keep dying! "
                + "\nQ – Quit  (you wimp...) "
                + "\nE - End the game"
                + "\n--------------------------------------");
    }
        
        
        
     
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value){
            case "N": //start new game
                this.startNewGame();
                break;
            case "R": //restart existing game
                this.restartExistingGame();
                break;
            case "H": //display help menu
                this.displayHelpMenu();
                break;
            case "S"://save the game
                this.saveGame();
                break;
            case "E": //EndGameView
                this.displayEndgameView(); 
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        //start new game
        GameControl.createNewGame(TheLastOfUs.getPlayer());
        
        //display game menu
        IntroductionView intro = new IntroductionView();
        intro.display();
    }

    private void saveGame() {
        this.console.println("\nEnter the file name to save to");
        String filePath = this.getInput();
        try{
            //save game to specified file
            GameControl.saveGame(TheLastOfUs.getCurrentGame(), filePath);
        }catch (Exception e){
            ErrorView.display("MainMenuView",e.getMessage());
        }
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        //display help menu
        helpMenu.display();
    }

    private void displayEndgameView() {
        EndGameView endview = new EndGameView();
        //display endgameview
        endview.display();
    }
    private void restartExistingGame(){
        this.console.println("\nEnter the file name to load from");
        String filePath = this.getInput();
        try{
            //save game to specified file
            GameControl.getSavedGame(filePath);
        }catch (Exception e){
            ErrorView.display("MainMenuView",e.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
