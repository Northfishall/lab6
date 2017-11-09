package shiyan2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testmain_1 {
    Graph T = null;
    @Before
    public void setUp() throws Exception {
        T = new Graph("D:\\eclipse code\\shiyan2\\test_data.txt");

    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testqueryBridgeWords1()
    {
        main_1 example = new main_1();
        String result = example.queryBridgeWords(T, "birds", "none");
        assertEquals("No word1 or word2 in the graph!",result);
    }
    
    @Test
    public void testqueryBridgeWords2()
    {
        main_1 example = new main_1();
        String result = example.queryBridgeWords(T, "birds", "summer");
        assertEquals(" of",result);
    }
    
    @Test
    public void testqueryBridgeWords3()
    {
        main_1 example = new main_1();
        String result = example.queryBridgeWords(T, "summer", "window");
        assertEquals("No bridge words from word1 to word2!",result);
    }
    
    @Test
    public void testqueryBridgeWords4()
    {
        main_1 example = new main_1();
        String result = example.queryBridgeWords(T, "fall", "with");
        assertEquals(" away there",result);
    }
    

}
