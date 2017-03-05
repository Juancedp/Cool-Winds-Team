/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

import java.util.Scanner;

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
        
        switch (choice){
            case "R": //search for resources
                this.searchResources();
                break;
            case "V": //view the map
                this.viewMap();
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
        System.out.println("*** searchResources function called ***");
    }

    private void viewMap() {
        System.out.println("*** viewMap function called ***");
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
    

