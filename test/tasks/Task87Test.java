package tasks;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Task87Test {

    private static Task87 task87;

    @BeforeClass
    public static void setUp() throws Exception {
        task87 = new Task87();
    }

    @Test
    public void testCalc() {
       assertEquals(7, task87.calc(1234, 2));
    }

}
