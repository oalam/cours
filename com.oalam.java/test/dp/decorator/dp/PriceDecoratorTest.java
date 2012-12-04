/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decorator.dp;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author HumanBooster
 */
public class PriceDecoratorTest {
    
    public PriceDecoratorTest() {
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
     * Test of getPrice method, of class PriceDecorator.
     */
    @Test
    public void testGetPrice() {

        
        
        
        Book b = new Book();
        b.setPrice(120.95f);
        
        PercentDiscount pd = new PercentDiscount();
        pd.setAmount(0.2f);
        
        FixedAmountDiscount fd = new FixedAmountDiscount();
        fd.setAmount(10.0f);
        
        
        // set percent discount
        pd.setComponent(b);
        
        // set fixe discount
        fd.setComponent(pd);
        
        
        float finalPrice = fd.getPrice();
        float attendee = 120.95f*.8f - 10.0f;
        assertEquals(attendee, finalPrice,0.000000000000000001);
        
        
       // PercentDiscount pd2 = new PercentDiscount(new FixedAmountDiscount(new Book()));
        
    }



}
