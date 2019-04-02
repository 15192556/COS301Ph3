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
public class userDatabaseTest {
    
    public userDatabaseTest() {
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
     * Test of getPrefContact method, of class userDatabase.
     */
    @Test
    public void testGetPrefContact() {
        System.out.println("getPrefContact");
        int uID = 0;
        userDatabase instance = new userDatabase();
        String expResult = "";
        String result = instance.getPrefContact(uID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class userDatabase.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        int uID = 0;
        userDatabase instance = new userDatabase();
        String expResult = "";
        String result = instance.getEmail(uID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNo method, of class userDatabase.
     */
    @Test
    public void testGetPhoneNo() {
        System.out.println("getPhoneNo");
        int uID = 0;
        userDatabase instance = new userDatabase();
        String expResult = "";
        String result = instance.getPhoneNo(uID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is getting a phone number.");
    }
    
}
