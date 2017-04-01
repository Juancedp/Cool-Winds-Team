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
             + "\nM - Choose Motorcycle"
             + "\nL - Vehicle Report"); 
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
            case "L": //Choose report
                this.chooseReport();
                break;
             default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break; 
        }
             return true;
        }

    private void chooseCar() {
        this.console.println("Choose the car or perrish");
      
    }

    private void chooseTruck() {
        this.console.println("If you choose the truck you...");
    }

    private void chooseMotorcycle() {
       this.console.println("Choose the motorcycle and keep runing");
   
    }

    private void chooseReport() {
     VehicleReportView vehiclereportview = new VehicleReportView();
     vehiclereportview.display ();
    }
    
}

