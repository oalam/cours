/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.command;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author HumanBooster
 */
public class CommandTest {

    public CommandTest() {
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
     * Test of execute method, of class Command.
     */
    @Test
    public void testExecute() {

        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);

        assertFalse(lamp.isOn());
        switchUp.execute();
        assertTrue(lamp.isOn());
        switchDown.execute();
        assertFalse(lamp.isOn());
    }
}
