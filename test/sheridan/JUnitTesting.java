/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author Jimmy Kessie 
 */
public class JUnitTesting {
	
	public JUnitTesting() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	

	
	@AfterClass
	public static void tearDownClass() {
	}
	
	

	   @Test
    public void testGetCartSizeGood() {
        System.out.println("getCartSize");
        Cart instance = new Cart();
        int expResult = 0;
        int result = instance.getCartSize();
        assertEquals(expResult, result);
        assertNotEquals("Card doesnt have min length required" , expResult + result);
    }
    
    //
    @Test
    public void testGetCartSizeBad() {
        System.out.println("getCartSize");
        Cart instance = new Cart();
        int expResult = -1;
        int result = instance.getCartSize();
        assertEquals(expResult, result);
        assertEquals("Card doesn't have min length required", expResult + result);

    }   

	
}


