import org.junit.Before;
import org.junit.Test;
import tasks.Task108;
import static org.junit.Assert.*;

/**
 * Created by cavayman on 21.06.2016.
 */
public class Task108Test {
    static Task108 task;

    @Before
    public void beforeTest() {
        task = new Task108();
    }


    @Test
    public void testGetTaskNumber() throws Exception {
        System.out.println("Get task number Test");
        assertEquals("108", task.getTaskNumber());
        assertNotEquals("107", task.getTaskNumber());
    }

    @Test
    public void testGetTaskCondition() throws Exception {
        assertEquals("Given a natural number n. Get the smallest number represented as 2^r higher than n.", task.getTaskCondition());
        assertNotEquals("Given a natural number n. Get the smallest number represented as 2^r higher than n..", task.getTaskCondition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIntCalcForException() {
        task.calc(-2);
    }
    @Test
    public void testIntCalc() {
        assertEquals(1, task.calc(1));
        assertEquals(10, task.calc(512));
        assertEquals(3, task.calc(4));
        assertEquals(10, task.calc(512));
    }
}