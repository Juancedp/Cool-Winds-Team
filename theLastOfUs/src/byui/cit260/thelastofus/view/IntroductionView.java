/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.view;

/**
 *
 * @author Karl
 */
public class IntroductionView extends View {
    IntroductionView(){
        super("\nGood morning. You find yourself in a hospital bed. The "
                + "\ninfirmary around you is deserted. There is a letter on your"
                + "\nbedside table. It reads as follows:"
                + "\nMy name is John Smith. I´ve been trying to survive in"
                + "\nSaint George Utah, but things are getting worse every day."
                + "\nI’ve lost all my family and friends, and I don’t remember the"
                + "\nlast time I saw a living person. I don’t know why the virus"
                + "\ndoesn't affect me (I was bitten by my neighbor when I was"
                + "\ntrying to help her husband) but so far, I still feel ok. "
                + "\nAs far as I know everyone that is bitten doesn't last more "
                + "\nthan 2 hours, so don´t get anywhere near a contaminated "
                + "\nperson. After reading this message, please come after me, "
                + "\nI’m going towards Rexburg Idaho. I heard though a radio "
                + "\nbroadcast that there are some people who have found a way to "
                + "\nsurvive through all this chaos, and they are working to find "
                + "\na cure. Perhaps the answer to stop this virus is currently "
                + "\nrunning through my veins. I’m stopping periodically to search"
                + "\nfor supplies, and I´ll always leave a red mark wherever I "
                + "\nstop.  "
                + "\nPs - Be careful!"
                + "\n"
                + "\nWhat will you do?"
                + "\nG - Get up and look around"
                + "\nB - Go back to bed, this is just some weird dream...");
    }
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();
        switch (value){
                case "G":
                    System.out.println("You are a bit groggy, but otherwise ok."
                            + "\nThis room is very messy, as if there was an"
                            + "intense struggle");
                    GameMenuView gameMenu = new GameMenuView();
                     gameMenu.display();
                     break;
                case "B":
                    System.out.println("That was an unwise decision. When you"
                            + "awake you are surrounded by zombies \nand have"
                            + "an unquenchable desire for braaains.");
                    break;
                
    }
        return false;
    }
}
