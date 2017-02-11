/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karl
 */
public class PlayerControlTest {
    
    public PlayerControlTest() {
    }

    /**
     * Test of healthPlayer method, of class PlayerControl.
     */
    @Test
    public void testHealthPlayer() {
        System.out.println("healthPlayer");
        boolean infected = false;
        boolean wounded = false;
        int timeInfected = 0;
        int timeWounded = 0;
        PlayerControl instance = new PlayerControl();
        double expResult = 100.0;
        double result = instance.healthPlayer(infected, wounded, timeInfected, timeWounded);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testHealthPlayer2() {
        System.out.println("healthPlayer");
        boolean infected = true;
        boolean wounded = true;
        int timeInfected = 4;
        int timeWounded = 4;
        PlayerControl instance = new PlayerControl();
        double expResult = 72.0;
        double result = instance.healthPlayer(infected, wounded, timeInfected, timeWounded);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
}
 public void testHealthPlayer3() {
        System.out.println("healthPlayer");
        boolean infected = true;
        boolean wounded = false;
        int timeInfected = 4;
        int timeWounded = 0;
        PlayerControl instance = new PlayerControl();
        double expResult = 84.0;
        double result = instance.healthPlayer(infected, wounded, timeInfected, timeWounded);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
 } 
public void testHealthPlayer4() {
        System.out.println("healthPlayer");
        boolean infected = false;
        boolean wounded = true;
        int timeInfected = 0;
        int timeWounded = 4;
        PlayerControl instance = new PlayerControl();
        double expResult = 88.0;
        double result = instance.healthPlayer(infected, wounded, timeInfected, timeWounded);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
}
public void testHealthPlayer5() {
        System.out.println("healthPlayer");
        boolean infected = true;
        boolean wounded = true;
        int timeInfected = -2;
        int timeWounded = -1;
        PlayerControl instance = new PlayerControl();
        double expResult = -1.0;
        double result = instance.healthPlayer(infected, wounded, timeInfected, timeWounded);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
}
public void testHealthPlayer6() {
        System.out.println("healthPlayer");
        boolean infected = true;
        boolean wounded = false;
        int timeInfected = 0;
        int timeWounded = 0;
        PlayerControl instance = new PlayerControl();
        double expResult = -1.0;
        double result = instance.healthPlayer(infected, wounded, timeInfected, timeWounded);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
}
public void testHealthPlayer7() {
        System.out.println("healthPlayer");
        boolean infected = false;
        boolean wounded = false;
        int timeInfected = 2;
        int timeWounded = 2;
        PlayerControl instance = new PlayerControl();
        double expResult = -1.0;
        double result = instance.healthPlayer(infected, wounded, timeInfected, timeWounded);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
}
public void testHealthPlayer8() {
        System.out.println("healthPlayer");
        boolean infected = false;
        boolean wounded = false;
        int timeInfected = 0;
        int timeWounded = 0;
        PlayerControl instance = new PlayerControl();
        double expResult = 100.0;
        double result = instance.healthPlayer(infected, wounded, timeInfected, timeWounded);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
}
public void testHealthPlayer9() {
        System.out.println("healthPlayer");
        boolean infected = true;
        boolean wounded = true;
        int timeInfected = 24;
        int timeWounded = 24;
        PlayerControl instance = new PlayerControl();
        double expResult = -68.0;
        double result = instance.healthPlayer(infected, wounded, timeInfected, timeWounded);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
}
public void testHealthPlayer10() {
        System.out.println("healthPlayer");
        boolean infected = true;
        boolean wounded = false;
        int timeInfected = 24;
        int timeWounded = 0;
        PlayerControl instance = new PlayerControl();
        double expResult = 4.0;
        double result = instance.healthPlayer(infected, wounded, timeInfected, timeWounded);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
}




}

