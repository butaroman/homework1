import org.junit.Before;
import org.junit.Test;
import tasks.Task561;

import static org.junit.Assert.*;

/**
 * Created by cavayman on 21.06.2016.
 */
public class Task561Test {
    static Task561 task;

    @Before
    public void beforeTest() {
        task = new Task561();
    }

    @Test
    public void testGetTaskNumber() throws Exception {
        assertEquals("561",task.getTaskNumber());
        assertNotEquals("102",task.getTaskNumber());
    }

    @Test
    public void testGetTaskCondition() throws Exception {
assertNotEquals("Its time to party!!!!!",task.getTaskCondition());
    }

}