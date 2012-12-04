/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xmljava;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class ConfReaderTest {
    
    public ConfReaderTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setup method, of class ConfReader.
     */
    @Test
    public void testSetup() {
        System.out.println("setup");
        ConfReader instance = new ConfReader();
        instance.setup();
        
        
        assertEquals(instance.daotype, "mock");
    }
}
