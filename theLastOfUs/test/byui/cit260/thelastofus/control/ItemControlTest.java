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
public class ItemControlTest {
    
    public ItemControlTest() {
    }

    /**
     * Test of Itemtype method, of class ItemControl.
     */
    @Test
    public void testItemtype() {
        System.out.println("Itemtype");
        int gun = 0;
        int stone = 0;
        int knife = 0;
        ItemControl instance = new ItemControl();
        String expResult = "knife";
        String result = instance.Itemtype(gun, stone, knife);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    public void testItemtype2() {
        System.out.println("Itemtype");
        int gun = 6;
        int stone = 0;
        int knife = 0;
        ItemControl instance = new ItemControl();
        String expResult = "gun";
        String result = instance.Itemtype(gun, stone, knife);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    public void testItemtype3() {
        System.out.println("Itemtype");
        int gun = 0;
        int stone = 10;
        int knife = 0;
        ItemControl instance = new ItemControl();
        String expResult = "stone";
        String result = instance.Itemtype(gun, stone, knife);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

}
