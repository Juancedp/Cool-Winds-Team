/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.coolwinds.model;

import java.util.Objects;
import byui.cit260.coolwinds.model.Hospital;
/**
 *
 * @author moebi
 
 */
public class Hospital implements Serializable{
    
    public static void main(String[] args){
        Hospital hospitalOne = new Hospital();
    }
    // class instance variables
    private String description;
    private double room;
    private double length;
    private double width;
    private double sqftofroom;

    public Hospital(String description) {
        this.description = description;
    }

    private Hospital() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.room) ^ (Double.doubleToLongBits(this.room) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.length) ^ (Double.doubleToLongBits(this.length) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.sqftofroom) ^ (Double.doubleToLongBits(this.sqftofroom) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Hospital{" + "description=" + description + ", room=" + room + ", length=" + length + ", width=" + width + ", sqftofroom=" + sqftofroom + '}';
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
        final Hospital other = (Hospital) obj;
        if (Double.doubleToLongBits(this.room) != Double.doubleToLongBits(other.room)) {
            return false;
        }
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sqftofroom) != Double.doubleToLongBits(other.sqftofroom)) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRoom() {
        return room;
    }

    public void setRoom(double room) {
        this.room = room;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSqftofroom() {
        return sqftofroom;
    }

    public void setSqftofroom(double sqftofroom) {
        this.sqftofroom = sqftofroom;
    }
    
    
        
}
