/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Karl
 */
public enum Character implements Serializable {
    John_Smith("The man you are trying to find. He has the antidote in his blood.");
    private final String description;
    private final Point location;

    private Character(String description) {
        this.description = description;
        location = new Point(1,1);
    }
    
    
}
