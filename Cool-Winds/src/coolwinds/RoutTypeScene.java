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
public class RoutTypeScene implements Serializable{
    
    public static void main(String[] args) {
       RoutTypeScene routTypeScene = new RoutTypeScene();
       
    }
    
    private String travelTime;
    private double description;
    private double resourceType;
    private double blockedLocation;
    private double buildingType;

    public RoutTypeScene() {
    }

    
    public String getTravelTime() {
        return travelTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.travelTime);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.description) ^ (Double.doubleToLongBits(this.description) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.resourceType) ^ (Double.doubleToLongBits(this.resourceType) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.blockedLocation) ^ (Double.doubleToLongBits(this.blockedLocation) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.buildingType) ^ (Double.doubleToLongBits(this.buildingType) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "RoutTypeScene{" + "travelTime=" + travelTime + ", description=" + description + ", resourceType=" + resourceType + ", blockedLocation=" + blockedLocation + ", buildingType=" + buildingType + '}';
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
        final RoutTypeScene other = (RoutTypeScene) obj;
        if (Double.doubleToLongBits(this.description) != Double.doubleToLongBits(other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.resourceType) != Double.doubleToLongBits(other.resourceType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.blockedLocation) != Double.doubleToLongBits(other.blockedLocation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.buildingType) != Double.doubleToLongBits(other.buildingType)) {
            return false;
        }
        if (!Objects.equals(this.travelTime, other.travelTime)) {
            return false;
        }
        return true;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }

    public double getResourceType() {
        return resourceType;
    }

    public void setResourceType(double resourceType) {
        this.resourceType = resourceType;
    }

    public double getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(double blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public double getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(double buildingType) {
        this.buildingType = buildingType;
    }
    
    
    
}
