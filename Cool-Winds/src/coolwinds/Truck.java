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
public class Truck implements Serializable {
    
    public static void main(String[] args){
        Truck truckOne = new Truck();
        
    }
    private String truckType;
    private double description;
    private double gps;
    private double passangerCapacity;

    public Truck() {
    }

    
    public String getTruckType() {
        return truckType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.truckType);
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.description) ^ (Double.doubleToLongBits(this.description) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.gps) ^ (Double.doubleToLongBits(this.gps) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.passangerCapacity) ^ (Double.doubleToLongBits(this.passangerCapacity) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Truck{" + "truckType=" + truckType + ", description=" + description + ", gps=" + gps + ", passangerCapacity=" + passangerCapacity + '}';
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
        final Truck other = (Truck) obj;
        if (Double.doubleToLongBits(this.description) != Double.doubleToLongBits(other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gps) != Double.doubleToLongBits(other.gps)) {
            return false;
        }
        if (Double.doubleToLongBits(this.passangerCapacity) != Double.doubleToLongBits(other.passangerCapacity)) {
            return false;
        }
        if (!Objects.equals(this.truckType, other.truckType)) {
            return false;
        }
        return true;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
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

    public double getPassangerCapacity() {
        return passangerCapacity;
    }

    public void setPassangerCapacity(double passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }
    
}
