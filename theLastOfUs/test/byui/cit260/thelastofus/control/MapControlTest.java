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
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of differentLocation method, of class MapControl.
     */
    @Test
    public void testDifferentLocation() {
        System.out.println("differentLocation");
        double distance = 90.0;
        double resources = 10.0;
        MapControl instance = new MapControl();
        double expResult = 1.5;
        double result = instance.differentLocation(distance, resources);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    public void testDifferentLocationTwo() {
        System.out.println("differentLocation");
        double distance = 0.0;
        double resources = 8.0;
        MapControl instance = new MapControl();
        double expResult = -1.0;
        double result = instance.differentLocation(distance, resources);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    public void testDifferentLocationThree() {
        System.out.println("differentLocation");
        double distance = 20.0;
        double resources = 2.0;
        MapControl instance = new MapControl();
        double expResult = -1.0;
        double result = instance.differentLocation(distance, resources);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    public void testDifferentLocationFour() {
        System.out.println("differentLocation");
        double distance = 52.0;
        double resources = 8.0;
        MapControl instance = new MapControl();
        double expResult = -1.0;
        double result = instance.differentLocation(distance, resources);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    public void testDifferentLocationFive() {
        System.out.println("differentLocation");
        double distance = 60.0;
        double resources = 10.0;
        MapControl instance = new MapControl();
        double expResult = 1.0;
        double result = instance.differentLocation(distance, resources);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    public void testDifferentLocationSix() {
        System.out.println("differentLocation");
        double distance = 100.0;
        double resources = 8.0;
        MapControl instance = new MapControl();
        double expResult = 1.66;
        double result = instance.differentLocation(distance, resources);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    public void testDifferentLocationSeven() {
        System.out.println("differentLocation");
        double distance = 30.0;
        double resources = 10.0;
        MapControl instance = new MapControl();
        double expResult = 0.5;
        double result = instance.differentLocation(distance, resources);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
