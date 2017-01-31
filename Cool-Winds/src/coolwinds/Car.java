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
public class Car implements Serializable {
   
    public static void main(String[] args) {
    Car carOne = new Car();
    
    }
    private String carType;
    private double description;
    private double gps;

    public Car() {
    }

    
    public String getCarType() {
        return carType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.carType);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.description) ^ (Double.doubleToLongBits(this.description) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.gps) ^ (Double.doubleToLongBits(this.gps) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Car{" + "carType=" + carType + ", description=" + description + ", gps=" + gps + '}';
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
        final Car other = (Car) obj;
        if (Double.doubleToLongBits(this.description) != Double.doubleToLongBits(other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gps) != Double.doubleToLongBits(other.gps)) {
            return false;
        }
        if (!Objects.equals(this.carType, other.carType)) {
            return false;
        }
        return true;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }

    public double getGps() {
        return gps;
    }

    public void setGps(double gps) {
        this.gps = gps;
    }
    
}
