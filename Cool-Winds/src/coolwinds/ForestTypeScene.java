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
public class ForestTypeScene implements Serializable {
    
    public static void main(String[] args){
        ForestTypeScene forestTypeSceneOne = new ForestTypeScene();
        
    }
    private String forestTypeScene;
    private double description;
    private double travelTime;
    private double safetyPlace;

    public ForestTypeScene() {
    }

    
    public String getForestTypeScene() {
        return forestTypeScene;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.forestTypeScene);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.description) ^ (Double.doubleToLongBits(this.description) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.safetyPlace) ^ (Double.doubleToLongBits(this.safetyPlace) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "ForestTypeScene{" + "forestTypeScene=" + forestTypeScene + ", description=" + description + ", travelTime=" + travelTime + ", safetyPlace=" + safetyPlace + '}';
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
        final ForestTypeScene other = (ForestTypeScene) obj;
        if (Double.doubleToLongBits(this.description) != Double.doubleToLongBits(other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.safetyPlace) != Double.doubleToLongBits(other.safetyPlace)) {
            return false;
        }
        if (!Objects.equals(this.forestTypeScene, other.forestTypeScene)) {
            return false;
        }
        return true;
    }

    public void setForestTypeScene(String forestTypeScene) {
        this.forestTypeScene = forestTypeScene;
    }

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public double getSafetyPlace() {
        return safetyPlace;
    }

    public void setSafetyPlace(double safetyPlace) {
        this.safetyPlace = safetyPlace;
    }
    
    
    
}
