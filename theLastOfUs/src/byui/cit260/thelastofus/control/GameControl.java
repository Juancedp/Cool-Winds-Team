/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.control;

import byui.cit260.thelastofus.model.Player;
import thelastofus.TheLastOfUs;

/**
 *
 * @author Karl
 */
public class GameControl {

    public static Player createPlayer(String playerName) {
      if (playerName == null ){ 
   return null; 
      }
     Player player = new Player(); 
 player.setName(playerName);
 
TheLastOfUs.setPlayer(player);
 //Save the Player as a global variable 
return player;
  
         
    }

    public static void createNewGame(Player player) {
       System.out.println("*** createNewGame function called ***");
    }
    
}
