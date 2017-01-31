/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coolwinds;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author moebi
 */
public class Character implements Serializable {
  
    public static void main(String[] args){
     Character characterOne = new Character();
     
     characterOne.setName("Superman");
     characterOne.setDescription("tall");
     characterOne.setCoordinales(0);
     
     String characterInfo = characterOne.toString();
     System.out.println(characterInfo);
    }
    // class instance variables
    private String character;
    private double description;
    private double coordinales;

    public Character() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.character);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.description) ^ (Double.doubleToLongBits(this.description) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.coordinales) ^ (Double.doubleToLongBits(this.coordinales) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (Double.doubleToLongBits(this.description) != Double.doubleToLongBits(other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.coordinales) != Double.doubleToLongBits(other.coordinales)) {
            return false;
        }
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "character=" + character + ", description=" + description + ", coordinales=" + coordinales + '}';
    }
    
    

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }

    public double getCoordinales() {
        return coordinales;
    }

    public void setCoordinales(double coordinales) {
        this.coordinales = coordinales;
    }

    private void setName(String superman) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDescription(String tall) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
