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
public class auditLogsTest {
    
    public auditLogsTest() {
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
     * Test of addLog method, of class auditLogs.
     */
    @Test
    public void testAddLog() {
        System.out.println("addLog");
        String clientID = "7371";
        String descr = "Notification sent";
        auditLogs.addLog(clientID, descr);
        // TODO review the generated test code and remove the default call to fail.
        fail("Notification not sent.");
    }

    /**
     * Test of pushToReporting method, of class auditLogs.
     */
    @Test
    public void testPushToReporting() {
        System.out.println("pushToReporting");
        auditLogs.pushToReporting();
        // TODO review the generated test code and remove the default call to fail.
        fail("Could not push to reporting.");
    }
    
}
