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
public class ItemControl {
    public String Itemtype ( int gun, int stone, int knife){
        if (gun == 0 ) { 
                return "knife";}
        if (stone == 0) {
                return "knife";}
        if (gun == 0 && stone ==0){
            return "knife";
        }
return "gun";
}
}
