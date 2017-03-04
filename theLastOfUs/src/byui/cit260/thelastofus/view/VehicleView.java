/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

/**
 *
 * @author moebi
 */
public class VehicleView extends View {
    VehicleView(){
     super("\nYou have three types of different vehicles, "
             + "\nchoose one before you lose your brain"
             + "\nCa - Choose Car"
             + "\nTr - Choose Truck"
             + "\nMo - Choose Motorcycle");  
}
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();
        
        switch (value){
            case "Ca": //Choose car
                this.chooseCar();
                break;
            case "Tr": //Choose truck
                this.chooseTruck();
                break;
            case "Mo": //Choose motorcycle 
                this.chooseMotorcycle();
                break;
             default:
                System.out.println("\n*** Invalid selection *** Try again");
                break; 
        }
             return false;
        }
}


   