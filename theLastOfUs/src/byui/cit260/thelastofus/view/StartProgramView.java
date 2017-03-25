/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

import byui.cit260.thelastofus.control.GameControl;
import byui.cit260.thelastofus.model.Player;
import java.util.Scanner;

/**
 *
 * @author Karl
 */
public class StartProgramView extends View{
    
    
    public StartProgramView() {
        super("\nPlease enter your name:");
        this.displayBanner();
        //prompt user to enter name
        //display banner
        
    }

    private void displayBanner() {
        this.console.println(
                "***************************************************************"
               + "\n"
               + "\nA terrible accident on an important international "
               + "\nlaboratory,has released a deadly virus, well, "
               + "\nI guess deadly is not the right way to describe it, because  "
               + "\nall people that get exposed to the virus, besides dying  "
               + "\nin 2 hours, they don’t stand still to be buried, "
               + "\nthey rise again. The problem is that they are not the same "
               + "\npeople they used to be,they turn into a horrible thing, "
               + "\nwhich sadly cannot be called “human” anymore. The critical "
               + "\npoint is that the virus has taken months until people  "
               + "\nstarted getting sick,and you can’t imagine how quickly, "
               + "\nuntil it has spread throughout the world."
               + "\n"
               +"\nYour goal is survival. Good Luck, try not to die too quickly!"
               + "\n"
               + "**************************************************************"
        );
    }

   
    @Override
    public boolean doAction(String playerName) {
        if (playerName.length() < 2){
  ErrorView.display(this.getClass().getName(),"Invalid name: The name must be > 1 character"); 
  return false;
          }
         Player player = GameControl.createPlayer(playerName); 
 if (player == null){//if unsuccessful  
  ErrorView.display(this.getClass().getName(),"\nError creating player."); 
  return false;
 }
 //display customized welcome message 
 this.displayNextView(player);
 return true; 
    }

    private void displayNextView(Player player) {
        this.console.println("\n******************************"
                + "\nWelcome to the game "+ player.getName()
        +"\nDon't feel too bad about dying..."
                + "\n******************************");
        //create mainmenu view object
        MainMenuView mainMenuView = new MainMenuView();
        //display main menu
        mainMenuView.display();
    }
    
    
}
