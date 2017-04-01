/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

import byui.cit260.thelastofus.model.Game;
import byui.cit260.thelastofus.model.Item;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import thelastofus.TheLastOfUs;

/**
 *
 * @author Karl
 */
public class ItemReportView extends View {
    private static final PrintWriter itemReport = TheLastOfUs.getReportFile();
    ItemReportView(){
        
        super("Enter the name of the file to print report to:");
        
    }
    @Override
    public boolean doAction(String value){
        try{
         
        printReport(value);
        }catch(IOException e){
            ErrorView.display("ItemReportView", "error printing report");
        }
        return true;
    }

    private void printReport(String filePath) throws IOException{
        FileOutputStream fops = new FileOutputStream(filePath+".txt");
           ObjectOutputStream output = new ObjectOutputStream(fops);
           Item item = new Item();
           output.writeObject(item);
        
    }
}
