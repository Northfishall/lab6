package shiyan2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testrandwalk {
    Graph T = null;
    @Before
    public void setUp() throws Exception {
        T = new Graph("D:\\eclipse code\\shiyan2\\test_data.txt");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testrandwalk1() {
        main_1 example = new main_1();
        String result = example.randomWalk(T, T.num, 28);
        assertEquals(null,result);
    }
    
    @Test
    public void testrandwalk2() {
        main_1 example = new main_1();
        String result = example.randomWalk(T, T.num, 0);
        assertEquals("birds",result);
    }
    
    @Test
    public void testrandwalk3() {
        main_1 example = new main_1();
        T.visited[8][9]=1;
        String result = example.randomWalk(T, T.num, 8);
        assertEquals("and no more",result);
    }

}
