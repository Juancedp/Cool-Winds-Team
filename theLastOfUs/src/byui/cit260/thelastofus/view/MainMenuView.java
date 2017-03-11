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
            case "E": //EndGameView
                this.displayEndgameView(); 
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
        IntroductionView intro = new IntroductionView();
        intro.display();
    }

    private void restartExistingGame() {
        System.out.println("*** restartExistingGame function called ***");
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
    
}
