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
public class sendMailTest {
    
    public sendMailTest() {
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
     * Test of send method, of class sendMail.
     */
    @Test
    public void testSend() {
        System.out.println("send");
        String to = "Stefan";
        String sub = "";
        String msg = "Hello FNB has a new ATM";
        String user = "";
        String pass = "";
        sendMail.send(to, sub, msg, user, pass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is under construction.");
    }
    
}
