package tasks;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

/**
 * Created by nataliia on 21.06.16.
 */
public class Task88aTest {

    private Task88a task;

    @Before
    public void beforeTest() {
        task = new Task88a();
    }

    @Test
    public void isPresentThree() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("124".getBytes());
        System.setIn(in);
        task.solution();
        assertTrue(task.isPresentThree());

        task.setNumber(12);
        assertFalse(task.isPresentThree());
    }

    @Test
    public void solution() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("124".getBytes());
        System.setIn(in);
        assertEquals("The number " + 15376 + " contains the number 3",task.solution());

        in = new ByteArrayInputStream("12".getBytes());
        System.setIn(in);
        assertEquals("The number " + 144 + " does not contain the number 3",task.solution());
    }

    @Test
    public void getTaskNumber() throws Exception {
        String result = task.getTaskNumber();
        assertEquals("88a",result);
    }

    @Test
    public void getTaskCondition() throws Exception {
        String result = task.getTaskCondition();
        assertEquals("Given a positive integer n. \nFind out whether the number 3 in the record number n * n.",result);
    }

    @Test
    public void getNumber() throws Exception {
        task.setNumber(1);
        assertEquals(1, task.getNumber());
    }

    @Test
    public void setNumber() throws Exception {
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
        assertEquals("Task88a{n=" + number + "}",result);
    }

}