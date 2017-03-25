/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.model;

import byui.cit260.thelastofus.view.ErrorView;
import java.io.Serializable;

/**
 *
 * @author Karl
 */
public class Map implements Serializable {
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;
    
    public Map(){
        
    }

    public Map(int noOfRows, int noOfColumns){
        if(noOfRows < 1 || noOfColumns < 1){
            ErrorView.display(this.getClass().getName(),"The number of rows and columns must be > zero");
            return;
        }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        //create array for location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for(int row = 0; row < noOfRows; row++){
            for(int column = 0; column < noOfColumns; column++){
                //create new location object
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                //assign location to current position
                locations[row][column]=location;
            }
        }
    }
    
    
    public  Location[][] getLocation() {
        return locations;
    }

    public void setLocation(Location[][] location) {
        this.locations = location;
    }
    
    
}
