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
        String to = "u16050607@tuks.co.za";
        String subject = "Greeting";
        String msg = "hello world";
        sendMail.send(to, subject, msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("Message not sent.");
    }
    
}
