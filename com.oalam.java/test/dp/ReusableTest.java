/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import dp.Reusable;
import dp.ReusableFactory;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author HumanBooster
 */
public class ReusableTest {

    public ReusableTest() {
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
     * Test of doStuff method, of class Reusable.
     */
    @Test
    public void testFactory() {


        //   Reusable r0 = new Reusable();
        Reusable r1 = ReusableFactory.createReusable();
        Reusable r2 = ReusableFactory.createReusable();

    }

    @Test
    public void testPoolSize() {

        ReusablePool pool = ReusablePool.getInstance();

        pool.clear();
        int count = 0;
        while (pool.acquire() != null && count < 100) {
            count++;
        }

        assertEquals(10, count);
    }

    @Test
    public void testPoolRelease() {

        ReusablePool pool2 = ReusablePool.getInstance();
        pool2.clear();
        Reusable tmp = pool2.acquire();
        
        
        while (pool2.acquire() != null) {
        }

        pool2.release(tmp);
        assertNotNull(pool2.acquire());

    }

    @Test
    public void testPoolSingleton() {
        ReusablePool pool = ReusablePool.getInstance();
        ReusablePool pool2 = ReusablePool.getInstance();


        assertSame(pool, pool2);


    }
}
