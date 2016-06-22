import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.BeforeClass;
import tasks.Task559;

public class Task559Test {
    
    private static Task559 task559;

    @BeforeClass
    public static void setUp() throws Exception {
        task559 = new Task559();
    }

    @Test
    public void testGetTaskNumber() {
        assertTrue(task559.getTaskNumber().equals("559"));
        assertNotEquals(500, task559.getTaskNumber());
    }
    
    @Test(expected = IllegalArgumentException.class )
    public void testCalcWithInvalidParam() {
        int [] param = {-100, -50, -1};
        for(int i = 0; i < param.length; i++) {
            task559.calc(param[i]);
        }     
    }

    @Test
    public void testCalc() {
       // assertEquals("[7, 31, 127, 2047]", task559.calc(2500).toString());
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 31, 127, 2047));
        assertArrayEquals(list.toArray(), task559.calc(2500).toArray());
    }
}
