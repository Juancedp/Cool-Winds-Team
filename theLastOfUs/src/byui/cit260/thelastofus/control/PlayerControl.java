/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.control;

import byui.cit260.thelastofus.exceptions.PlayerControlException;

/**
 *
 * @author Karl
 */
public class PlayerControl {

      
    public double healthPlayer (boolean infected, boolean wounded, int timeInfected, int timeWounded) throws PlayerControlException{
        double health=100;
        if (timeInfected < 0 || timeWounded < 0){
            throw new PlayerControlException("Infection time can not be negative"
                                            +"Start again");
    }
	if (infected == true && timeInfected == 0){
		throw new PlayerControlException ("if you have no time infected"
                                                 +"then you can not infected again");
             }
	if (wounded == true && timeWounded == 0){
		throw new PlayerControlException("if you have no time wounded"
                                                +"you can not wonded again");
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
