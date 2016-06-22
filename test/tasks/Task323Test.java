package tasks;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.BeforeClass;
import org.junit.Test;


public class Task323Test {

    private static Task323 task323;
    
    @BeforeClass
    public static void setUp() throws Exception {
        task323 = new Task323();
    }
    
    @Test
    public void testCalc() {
       ArrayList<Integer> result = task323.calc(5);
       assertEquals("[1, 3]", result.toString());
    }
}
