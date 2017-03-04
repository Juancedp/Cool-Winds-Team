/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.control;

/**
 *
 * @author Karl
 */
public class MapControl {
    
    public static double differentLocation(double distance, double resources){
       if (distance == 0){
		return -1;
       }
	if (distance %10 !=0){
		return -1;
        }
	if (distance > 100){
		return -1;
        }
	if (resources < 4){
		return -1;
        }
    double time=distance/60;
return time;

    }
}
