/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

import byui.cit260.thelastofus.model.Vehicle;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author bujji
 */
    public class VehicleReportView extends View {
        VehicleReportView (){
super("here is your report, Enter the File path");
        }
    @Override
    public boolean doAction(String value) {
        try{
            printReport(value);
        }
        catch(IOException L){
          ErrorView.display ("VehicleReportView","Error Printing Report");
          
            
        }
            
            return true;
    }

    private void printReport(String value)throws IOException {
        FileOutputStream fops = new FileOutputStream(value);
           ObjectOutputStream output = new ObjectOutputStream(fops);
           Vehicle vehicle = new Vehicle();
           output.writeObject(vehicle);         
    }
    }

   
    
    
  
