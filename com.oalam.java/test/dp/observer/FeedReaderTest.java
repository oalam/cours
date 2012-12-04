/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observer;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author HumanBooster
 */
public class FeedReaderTest {
    
    public FeedReaderTest() {
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
     * Test of update method, of class FeedReader.
     */
    @Test
    public void testUpdate() {
        
        
        // subject = observable
        NewsFeed feed = new NewsFeed();
        
        // observer
        FeedReader reader = new FeedReader(feed);
        
        feed.attach(reader);
        feed.setSubjectState("hi patterns !");
        assertEquals(reader.getObserverState(), feed.getSubjectState());
        
        feed.detach(reader);
        feed.setSubjectState("what's up !");
        assertFalse(reader.getObserverState().equals(feed.getSubjectState()));
        
    }
}
