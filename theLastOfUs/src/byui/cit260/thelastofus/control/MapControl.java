/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.control;

import byui.cit260.thelastofus.model.Map;
import byui.cit260.thelastofus.model.Scene;
import byui.cit260.thelastofus.model.SceneType;

/**
 *
 * @author Karl
 */
public class MapControl {
    
    public static double differentLocation(double distance, double resources){
       if (distance == 0){
		return -1;
       }
	if (distance %10 !=0){
		return -1;
        }
	if (distance > 100){
		return -1;
        }
	if (resources < 4){
		return -1;
        }
    double time=distance/60;
return time;

    }

    static Map createMap() {
        //create map
        Map map = new Map(20,20);
        //create scenes
        Scene[] scenes = createScenes();
        //assign scenes to locations
        GameControl.assignScenes(map,scenes);
        return map;
     }

    static void characterStartLocation(Map map) {
        System.out.println("**** characterStartingLocation function called ***");
    }

    private static Scene[] createScenes() {
      Scene[] scenes = new Scene[SceneType.values().length];
       Scene gameOver = new Scene();
       gameOver.setDescription("Bad luck, you are now one of the many zombies.."
               + "\nHave fun shuffling around...I hope you like brains..." );
       scenes[SceneType.gameover.ordinal()]= gameOver;
       
       Scene hospitalRoom = new Scene();
       hospitalRoom.setDescription("This hospital has been empty for a while,"
               + "\nand it seems safe enough....but be careful, or else!");
       scenes[SceneType.hospital.ordinal()] =hospitalRoom;
       
       Scene forestScene = new Scene();
       forestScene.setDescription("Don't you just love the outdoors? Well, you "
               + "won't have time to enjoy it, \nbecause there are zombies everywhere.");
       scenes[SceneType.forest.ordinal()]= forestScene;
       
       Scene cityScene = new Scene();
       cityScene.setDescription("Main street used to be so popular, especially on "
               + "\nSaturdays. There are still crowds here, but they are a little"
               + "\nless friendly...");
       scenes[SceneType.city.ordinal()]= cityScene;
       
       Scene routeScene = new Scene();
       routeScene.setDescription("On the road again. It is still the same stretch"
               + "\nof pavement. You feel a little exposed...and for good reason.");
       scenes[SceneType.route.ordinal()]= routeScene;
       
       Scene zombieScene = new Scene();
       zombieScene.setDescription("Uh oh, you find yourself surrounded by zombies."
               + "\nThink fast!");
       scenes[SceneType.zombies.ordinal()]= zombieScene;
       
       Scene startScene = new Scene();
       startScene.setDescription("You picked the wrong time to be around, there's"
               + "\nzombies about!");
       scenes[SceneType.start.ordinal()]= startScene;
       
       Scene endScene = new Scene();
       endScene.setDescription("Congratulations! You have synthesized a cure for"
               + "\nthe zombie disease! Now everyone can live in peace.");
       scenes[SceneType.ending.ordinal()]= endScene;
    return scenes;
    }
}
