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
             + "\nC - Choose Car"
             + "\nT - Choose Truck"
             + "\nM - Choose Motorcycle");  
}
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();
        
        switch (value){
            case "C": //Choose car
                this.chooseCar();
                break;
            case "T": //Choose truck
                this.chooseTruck();
                break;
            case "M": //Choose motorcycle 
                this.chooseMotorcycle();
                break;
             default:
                System.out.println("\n*** Invalid selection *** Try again");
                break; 
        }
             return true;
        }

    private void chooseCar() {
        System.out.println("Choose the car or perrish");
      
    }

    private void chooseTruck() {
        System.out.println("If you choose the truck you...");
    }

    private void chooseMotorcycle() {
       System.out.println("Choose the motorcycle and keep runing");
   
    }
    
}

