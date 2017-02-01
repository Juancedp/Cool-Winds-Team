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
public class CityTypeScene implements Serializable{
   
    public static void main(String[] args){
         CityTypeScene cityTypeSceneOne = new CityTypeScene();
         
    }
    
    private String description;
    private double buildingType;
    private double parks;
    private double blockedLocation;
    private double resourceType;
    private double travelTime;

    public CityTypeScene() {
    }

    
    public String getDescription() {
        return description;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.buildingType) ^ (Double.doubleToLongBits(this.buildingType) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.parks) ^ (Double.doubleToLongBits(this.parks) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.blockedLocation) ^ (Double.doubleToLongBits(this.blockedLocation) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.resourceType) ^ (Double.doubleToLongBits(this.resourceType) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "CityTypeScene{" + "description=" + description + ", buildingType=" + buildingType + ", parks=" + parks + ", blockedLocation=" + blockedLocation + ", resourceType=" + resourceType + ", travelTime=" + travelTime + '}';
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
        final CityTypeScene other = (CityTypeScene) obj;
        if (Double.doubleToLongBits(this.buildingType) != Double.doubleToLongBits(other.buildingType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.parks) != Double.doubleToLongBits(other.parks)) {
            return false;
        }
        if (Double.doubleToLongBits(this.blockedLocation) != Double.doubleToLongBits(other.blockedLocation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.resourceType) != Double.doubleToLongBits(other.resourceType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
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

    public double getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(double buildingType) {
        this.buildingType = buildingType;
    }

    public double getParks() {
        return parks;
    }

    public void setParks(double parks) {
        this.parks = parks;
    }

    public double getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(double blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public double getResourceType() {
        return resourceType;
    }

    public void setResourceType(double resourceType) {
        this.resourceType = resourceType;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }
    
    
}
