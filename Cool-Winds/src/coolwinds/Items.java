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
public class Items implements Serializable{
    
    public static void main(String[]args) {
       Items itemsOne = new Items(); 
    }
    private String Items;
    private double inventoryType;
    private double gunsType;
    private double quantityInStock;
    private double resourceInStock;
    private double hiddenItem;

    public Items() {
    }

    
    public String getItems() {
        return Items;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.Items);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.inventoryType) ^ (Double.doubleToLongBits(this.inventoryType) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.gunsType) ^ (Double.doubleToLongBits(this.gunsType) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.resourceInStock) ^ (Double.doubleToLongBits(this.resourceInStock) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.hiddenItem) ^ (Double.doubleToLongBits(this.hiddenItem) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Items{" + "Items=" + Items + ", inventoryType=" + inventoryType + ", gunsType=" + gunsType + ", quantityInStock=" + quantityInStock + ", resourceInStock=" + resourceInStock + ", hiddenItem=" + hiddenItem + '}';
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
        final Items other = (Items) obj;
        if (Double.doubleToLongBits(this.inventoryType) != Double.doubleToLongBits(other.inventoryType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gunsType) != Double.doubleToLongBits(other.gunsType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantityInStock) != Double.doubleToLongBits(other.quantityInStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.resourceInStock) != Double.doubleToLongBits(other.resourceInStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hiddenItem) != Double.doubleToLongBits(other.hiddenItem)) {
            return false;
        }
        if (!Objects.equals(this.Items, other.Items)) {
            return false;
        }
        return true;
    }

    public void setItems(String Items) {
        this.Items = Items;
    }

    public double getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(double inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getGunsType() {
        return gunsType;
    }

    public void setGunsType(double gunsType) {
        this.gunsType = gunsType;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getResourceInStock() {
        return resourceInStock;
    }

    public void setResourceInStock(double resourceInStock) {
        this.resourceInStock = resourceInStock;
    }

    public double getHiddenItem() {
        return hiddenItem;
    }

    public void setHiddenItem(double hiddenItem) {
        this.hiddenItem = hiddenItem;
    }
    
    
}
