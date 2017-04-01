/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

import java.util.Scanner;
import byui.cit260.thelastofus.control.MapControl;
import byui.cit260.thelastofus.exceptions.MapControlException;
import byui.cit260.thelastofus.model.Game;
import byui.cit260.thelastofus.model.Location;
import byui.cit260.thelastofus.model.Map;
import byui.cit260.thelastofus.model.Scene;
import java.util.logging.Level;
import java.util.logging.Logger;
import thelastofus.TheLastOfUs;
/**
 *
 * @author Karl
 */
public class DifferentLocationView extends View {
    
    public DifferentLocationView(){
    super("\nEnter the distance you want to travel: (To get to a new location, you must travel 60 miles)");
    }

    /**
     *
     * @param value
     * @return
     */
    @Override
     public boolean doAction(String value) {
         double distance = 0;
         
         try {
             //parse and convert number from text to double
            
             distance = Double.parseDouble(value);
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),"\nyou must enter a valid number."
                                  +"try again or enter Q to quit");
            }
    
        try {
           double timeDistance[] = MapControl.differentLocation(distance, 5);
           this.console.println("You made it. It took "+timeDistance[0]+" hours"
             + "\nTotal Distance traveled : "+timeDistance[1]);
        if (timeDistance[1]>0 && timeDistance[1]<60){
        Game game = TheLastOfUs.getCurrentGame();
       Map location = game.getMap(); 
         Location[][] Currentlocation = location.getLocation();
         Scene currentScene = Currentlocation[0][0].getScene();
         String message =currentScene.getDescription();
         this.console.println(message);
    }
        if (timeDistance[1]>60 && timeDistance[1]<120){
        Game game = TheLastOfUs.getCurrentGame();
       Map location = game.getMap(); 
         Location[][] Currentlocation = location.getLocation();
         Scene currentScene = Currentlocation[0][1].getScene();
         String message =currentScene.getDescription();
         this.console.println(message);
    }
         if (timeDistance[1]>180 && timeDistance[1]<240){
        Game game = TheLastOfUs.getCurrentGame();
       Map location = game.getMap(); 
         Location[][] Currentlocation = location.getLocation();
         Scene currentScene = Currentlocation[0][3].getScene();
         String message =currentScene.getDescription();
         this.console.println(message);
    }
          if (timeDistance[1]>240 && timeDistance[1]<360){
        Game game = TheLastOfUs.getCurrentGame();
       Map location = game.getMap(); 
         Location[][] Currentlocation = location.getLocation();
         Scene currentScene = Currentlocation[0][4].getScene();
         String message =currentScene.getDescription();
         this.console.println(message);
    }
           if (timeDistance[1]>360 && timeDistance[1]<480){
        Game game = TheLastOfUs.getCurrentGame();
       Map location = game.getMap(); 
         Location[][] Currentlocation = location.getLocation();
         Scene currentScene = Currentlocation[0][6].getScene();
         String message =currentScene.getDescription();
         this.console.println(message);
    }
            if (timeDistance[1]>480 && timeDistance[1]<540){
        Game game = TheLastOfUs.getCurrentGame();
       Map location = game.getMap(); 
         Location[][] Currentlocation = location.getLocation();
         Scene currentScene = Currentlocation[0][8].getScene();
         String message =currentScene.getDescription();
         this.console.println(message);
    }
             if (timeDistance[1]>540 && timeDistance[1]<600){
        Game game = TheLastOfUs.getCurrentGame();
       Map location = game.getMap(); 
         Location[][] Currentlocation = location.getLocation();
         Scene currentScene = Currentlocation[0][9].getScene();
         String message =currentScene.getDescription();
         this.console.println(message);
    }
              if (timeDistance[1]>600 && timeDistance[1]<720){
        Game game = TheLastOfUs.getCurrentGame();
       Map location = game.getMap(); 
         Location[][] Currentlocation = location.getLocation();
         Scene currentScene = Currentlocation[2][1].getScene();
         String message =currentScene.getDescription();
         this.console.println(message);
    }
               if (timeDistance[1]>720 && timeDistance[1]<780){
        Game game = TheLastOfUs.getCurrentGame();
       Map location = game.getMap(); 
         Location[][] Currentlocation = location.getLocation();
         Scene currentScene = Currentlocation[2][2].getScene();
         String message =currentScene.getDescription();
         this.console.println(message);
    }
                if (timeDistance[1]>780 && timeDistance[1]<840){
        Game game = TheLastOfUs.getCurrentGame();
       Map location = game.getMap(); 
         Location[][] Currentlocation = location.getLocation();
         Scene currentScene = Currentlocation[2][3].getScene();
         String message =currentScene.getDescription();
         this.console.println(message);
    }
                 if (timeDistance[1]>840 && timeDistance[1]<960){
        Game game = TheLastOfUs.getCurrentGame();
       Map location = game.getMap(); 
         Location[][] Currentlocation = location.getLocation();
         Scene currentScene = Currentlocation[2][4].getScene();
         String message =currentScene.getDescription();
         this.console.println(message);
    }
                  if (timeDistance[1]>960 && timeDistance[1]<1020){
        Game game = TheLastOfUs.getCurrentGame();
       Map location = game.getMap(); 
         Location[][] Currentlocation = location.getLocation();
         Scene currentScene = Currentlocation[2][6].getScene();
         String message =currentScene.getDescription();
         this.console.println(message);
         EndGameView endgame = new EndGameView();
         endgame.display();
    }
        } catch (MapControlException me) {
            ErrorView.display(this.getClass().getName(),me.getMessage());
        }
     
     
 return true;
    }

    

}
