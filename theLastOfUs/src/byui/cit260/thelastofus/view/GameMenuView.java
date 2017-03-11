/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

import byui.cit260.thelastofus.model.Game;
import byui.cit260.thelastofus.model.Item;
import byui.cit260.thelastofus.model.Location;
import byui.cit260.thelastofus.model.Map;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author Karl
 */
public class GameMenuView extends View {
    
    public GameMenuView(){
        super("\nR – Search for resources"
                + "\nV - View map "
                + "\nE - Explore Location "
                + "\nM – Move to new location "
                + "\nH – Check your health conditions "
                + "\nQ – Save and Quit Game");
        
    }
    

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        Game game = TheLastOfUs.getCurrentGame();
        Map map =game.getMap();
        Location location=new Location();
        switch (choice){
            case "R": //search for resources
                this.searchResources();
                break;
            case "V": //view the map
                this.viewMap(map,location);
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
        StringBuilder line;
        Game game =TheLastOfUs.getCurrentGame();
        Item[] items = game.getItems();
        
        System.out.println("\n  Resources available");
        line = new StringBuilder("                                 ");
        line.insert(0, "Description");
        line.insert(20, "In Stock");
        System.out.println(line.toString());
        
        //for each item
        for (Item item : items){
            line = new StringBuilder("                               ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getQuantity());
            //display
            System.out.println(line.toString());
        }
    }

    private void viewMap(Map map, Location location) {
        
        Location[][] locations = map.getLocation();
             
       System.out.println("Zombie map");
       
       for (Location[] row:locations){
           System.out.println("---------------------------------------------------");
           System.out.println("\n"+"1");
           for(Location[] column:locations){
               System.out.println("|");
               if(location.isVisited()){
                   System.out.println("??");
               }
               System.out.println("|");
           }
       }
    }

    private void explore() {
        System.out.println("*** explore function called ***");
    }

    private void moveLocation() {
        VehicleView vehicleview = new VehicleView();
        vehicleview.display();
        DifferentLocationView moveView = new DifferentLocationView();
        moveView.display();
    }

    private void healthCheck() {
        System.out.println("*** healthCheck function called ***");
    }
    }
    

