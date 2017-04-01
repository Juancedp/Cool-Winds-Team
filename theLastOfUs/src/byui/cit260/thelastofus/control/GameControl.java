/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.control;

import byui.cit260.thelastofus.exceptions.GameControlException;
import byui.cit260.thelastofus.model.Game;
import byui.cit260.thelastofus.model.Item;
import byui.cit260.thelastofus.model.ItemList;
import byui.cit260.thelastofus.model.Location;
import byui.cit260.thelastofus.model.Map;
import byui.cit260.thelastofus.model.Player;
import byui.cit260.thelastofus.model.Scene;
import byui.cit260.thelastofus.model.SceneType;
import byui.cit260.thelastofus.model.Vehicle;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
       Game game = new Game();//create game
       TheLastOfUs.setCurrentGame(game);//save game
       game.setPlayer(player);//save player
       
       //create inventory
       Item[] items = GameControl.createItemList();
       game.setItems(items);
       
       Map map = MapControl.createMap();//create new map
       game.setMap(map);//save map
       
       Vehicle vehicle = new Vehicle();//create vehicle
       game.setVehicle(vehicle);//save vehicle
       
       //characters to starting positions in map
       MapControl.characterStartLocation(map);
    }

    public static void saveGame(Game game, String filePath) throws GameControlException {
       try (FileOutputStream fops = new FileOutputStream(filePath)){
           ObjectOutputStream output = new ObjectOutputStream(fops);
           output.writeObject(game);
       }catch (Exception e){
           throw new GameControlException(e.getMessage());
       }
    
    }
    public static void getSavedGame(String filePath)throws GameControlException{
       Game game = null;
       try (FileInputStream fips = new FileInputStream(filePath)){
           ObjectInputStream input = new ObjectInputStream(fips);
           game=(Game) input.readObject(); //read game object from file
       }catch (Exception e){
           throw new GameControlException(e.getMessage());
       }//close output file
       TheLastOfUs.setCurrentGame(game);
    }
    private static Item[] createItemList() {
        //create array of items
        Item[] itemList = new Item[4];
        
        Item knife = new Item();
        knife.setDescription("A handy knife.");
        knife.setQuantity(0);
        itemList[ItemList.knife.ordinal()] = knife;
        
        Item stone = new Item();
        stone.setDescription("An average rock you picked up.");
        stone.setQuantity(0);
        itemList[ItemList.stone.ordinal()] = stone;
        
        Item gun = new Item();
        gun.setDescription("A versatile handgun.");
        gun.setQuantity(0);
        itemList[ItemList.gun.ordinal()] = gun;
        
        Item resources = new Item();
        resources.setDescription("Food, water, the stuff that keeps you alive.");
        resources.setQuantity(0);
        itemList[ItemList.resources.ordinal()] = resources;
        return itemList;
    }

    public static void assignScenes(Map map, Scene[] scenes) {
       Location [][] locations = map.getLocation();
        //start
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.zombies.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.city.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.city.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.route.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.zombies.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.route.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.city.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.zombies.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.zombies.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.ending.ordinal()]);
    }
    
}
