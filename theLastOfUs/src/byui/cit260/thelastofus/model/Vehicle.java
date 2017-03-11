/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.model;

import java.io.Serializable;

/**
 *
 * @author Karl
 */
public class Vehicle implements Serializable {
    private String description;
    private String type;

    public Vehicle() {
        this.description = "\nYour standard four door sedan, not fancy, but it runs.";
        this.type = "car";
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
