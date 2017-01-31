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
public class Motorcycle implements Serializable {
    
    public static void main(String[] args) {
    Motorcycle motorcycleOne = new Motorcycle();
    
    }
    private String motorcycleType;
    private double description;

    public Motorcycle() {
    }

    
    public String getMotorcycleType() {
        return motorcycleType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.motorcycleType);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.description) ^ (Double.doubleToLongBits(this.description) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Motorcycle{" + "motorcycleType=" + motorcycleType + ", description=" + description + '}';
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
        final Motorcycle other = (Motorcycle) obj;
        if (Double.doubleToLongBits(this.description) != Double.doubleToLongBits(other.description)) {
            return false;
        }
        if (!Objects.equals(this.motorcycleType, other.motorcycleType)) {
            return false;
        }
        return true;
    }

    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }
   
    
}
