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
public class Scene implements Serializable {
    
    public static void maid(String[] args) {
        Scene sceneOne = new Scene();
    }
    // class instance variable
    
    private String description;
    private double travelTime;
    private double routes;
    private double signsType;
    private double blockedLocation;

    public Scene() {
    }

    
    public String getDescription() {
        return description;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.routes) ^ (Double.doubleToLongBits(this.routes) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.signsType) ^ (Double.doubleToLongBits(this.signsType) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.blockedLocation) ^ (Double.doubleToLongBits(this.blockedLocation) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", routes=" + routes + ", signsType=" + signsType + ", blockedLocation=" + blockedLocation + '}';
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.routes) != Double.doubleToLongBits(other.routes)) {
            return false;
        }
        if (Double.doubleToLongBits(this.signsType) != Double.doubleToLongBits(other.signsType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.blockedLocation) != Double.doubleToLongBits(other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public double getRoutes() {
        return routes;
    }

    public void setRoutes(double routes) {
        this.routes = routes;
    }

    public double getSignsType() {
        return signsType;
    }

    public void setSignsType(double signsType) {
        this.signsType = signsType;
    }

    public double getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(double blockedLocation) {
        this.blockedLocation = blockedLocation;
    }
    
    
}
