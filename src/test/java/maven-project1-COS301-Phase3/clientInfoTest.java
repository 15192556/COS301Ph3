/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class clientInfoTest {
    
    public clientInfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEmail method, of class clientInfo.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String clientID = "7371";
        String expResult = "u16050607@tuks.co.za";
        String result = clientInfo.getEmail(clientID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Client not found.");
    }

    /**
     * Test of addClient method, of class clientInfo.
     */
    @Test
    public void testAddClient() {
        System.out.println("addClient");
        String clientID = "9999";
        String email = "tlotliona@gmail.com";
        clientInfo.addClient(clientID, email);
        // TODO review the generated test code and remove the default call to fail.
        fail("Client not added.");
    }

    /**
     * Test of hashFunction method, of class clientInfo.
     */
    @Test
    public void testHashFunction() {
        System.out.println("hashFunction");
        String clientID = "7371";
        int expResult = 0;
        int result = clientInfo.hashFunction(clientID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Not expected result.");
    }
    
}
