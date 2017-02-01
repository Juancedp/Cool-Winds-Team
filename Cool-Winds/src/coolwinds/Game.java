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
public class Game implements Serializable {
    
    public static void main(String[] args){
        Game gameOne = new Game();
    }
    private String totalTime;
    private double noPeople;
    private double maxScore;

    public Game() {
    }

    public String getTotalTime() {
        return totalTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.totalTime);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.noPeople) ^ (Double.doubleToLongBits(this.noPeople) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.maxScore) ^ (Double.doubleToLongBits(this.maxScore) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + ", maxScore=" + maxScore + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.noPeople) != Double.doubleToLongBits(other.noPeople)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxScore) != Double.doubleToLongBits(other.maxScore)) {
            return false;
        }
        if (!Objects.equals(this.totalTime, other.totalTime)) {
            return false;
        }
        return true;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public double getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(double noPeople) {
        this.noPeople = noPeople;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }
    
}
