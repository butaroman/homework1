package tasks;

import org.junit.*;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by nataliia on 21.06.16.
 */
public class Task88bTest {

    private Task88b task;

    @Before
    public void beforeTest() {
        task = new Task88b();
    }

    @Test
    public void setNumber() throws Exception {
        task.setNumber(1);
        assertEquals(1, task.getNumber());
    }

    @Test
    public void solution() throws Exception {
        ByteArrayInputStream number = new ByteArrayInputStream("124".getBytes());
        System.setIn(number);
        assertEquals(new StringBuilder(String.valueOf(number)).reverse().toString(),task.solution());
    }

    @Test
    public void getTaskNumber() throws Exception {
        String result = task.getTaskNumber();
        assertEquals("88b",result);
    }

    @Test
    public void getTaskCondition() throws Exception {
        String result = task.getTaskCondition();
        assertEquals("Given a positive integer n. \n" + "Make the reverse order of numbers.",result);
    }

    @Test
    public void getNumber() throws Exception {
        task.setNumber(1);
        assertEquals(1, task.getNumber());
    }

    @Test
    public void equals() throws Exception {
        Task88a task2 = new Task88a();
        task.setNumber(1);
        task2.setNumber(1);
        assertTrue(task.equals(task2));
        task2.setNumber(2);
        assertFalse(task.equals(task2));
    }

    @Test
    public void hashCodeTest() throws Exception {
        Task88a task2 = new Task88a();
        task.setNumber(1);
        task2.setNumber(1);
        assertTrue(task.equals(task2) && task2.equals(task));
        task2.setNumber(2);
        assertFalse(task.hashCode() == task2.hashCode());
    }

    @Test
    public void toStringTest() throws Exception {
        String result = task.toString();
        int number = 0;
        assertEquals("Task88b{n=" + number + "}",result);
    }

}