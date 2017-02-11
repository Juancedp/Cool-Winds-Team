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
public class PlayerControl {
    
    public double healthPlayer (boolean infected, boolean wounded, int timeInfected, int timeWounded){
        double health=100;
        if (timeInfected < 0 || timeWounded < 0){
            return -1;
    }
	if (infected == true && timeInfected == 0){
		return -1;
             }
	if (wounded == true && timeWounded == 0){
		return -1;
    }
	if (infected == false && wounded == false){
		health = 1.00*100;
                        }
	if (infected == true && wounded == false){
		health = (1.00-(0.04*timeInfected))*100;
        }
	if (infected == false && wounded == true){
		health = (1.00-(0.03*timeWounded))*100;
        }
	if (infected == true && wounded == true){
		health = (1.00-(0.04*timeInfected)-(0.03*timeWounded))*100;
        }
        return health;        
    }
    
}
