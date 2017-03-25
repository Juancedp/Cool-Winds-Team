/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thelastofus;

import byui.cit260.thelastofus.model.Game;
import byui.cit260.thelastofus.model.Player;
import byui.cit260.thelastofus.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karl
 */
public class TheLastOfUs {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile =null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //open character stream files for input and output
            TheLastOfUs.inFile= new BufferedReader(new InputStreamReader(System.in));
            TheLastOfUs.outFile = new PrintWriter(System.out, true);
            String filePath = "log.txt";
            TheLastOfUs.logFile = new PrintWriter(filePath);
            //create StartProgramView and start the program
            StartProgramView StartProgramView   = new StartProgramView();
           StartProgramView.display();
           return;
        } catch (Throwable te){
           System.out.println(te.getMessage());
           te.printStackTrace();
           
           }
        finally{
            try {
                if (TheLastOfUs.inFile != null){
                TheLastOfUs.inFile.close();}
                if (TheLastOfUs.outFile != null){
                TheLastOfUs.outFile.close();}
                if (TheLastOfUs.logFile != null){
                    TheLastOfUs.logFile.close();}
            } catch (IOException ex) {
                System.out.println("error closing files");
            }
        }
    }
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TheLastOfUs.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TheLastOfUs.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TheLastOfUs.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TheLastOfUs.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TheLastOfUs.logFile = logFile;
    }
    
}
