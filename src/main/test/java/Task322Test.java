package tasks;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by nataliia on 21.06.16.
 */
public class Task322Test {

    private Task322 task;

    @Before
    public void beforeTest() {
        task = new Task322();
    }

    @Test
    public void findNumberWithMaxSumOfDenominator() throws Exception {
        int result = task.findNumberWithMaxSumOfDenominator();
        assertEquals(9240,result);
    }

    @Test
    public void getMaxSumOfDivisors() throws Exception {
        task.setMaxSumOfDivisors(1);
        assertEquals(1, task.getMaxSumOfDivisors());
    }

    @Test
    public void solution() throws Exception {
        String result = task.solution();
        assertEquals("The number with the maximum sum of divisors = " + 9240,result);
    }

    @Test
    public void getTaskNumber() throws Exception {
        String result = task.getTaskNumber();
        assertEquals("322",result);
    }

    @Test
    public void getTaskCondition() throws Exception {
        String result = task.getTaskCondition();
        assertEquals("Find integer from 1 to 10,000 \n" + "with the maximum sum of divisors.",result);
    }

    @Test
    public void getNumber() throws Exception {
        task.setNumber(1);
        assertEquals(1, task.getNumber());
    }

    @Test
    public void equals() throws Exception {
        Task322 task2 = new Task322();
        task.setNumber(1);
        task2.setNumber(1);
        assertTrue(task.equals(task2));
        task2.setNumber(2);
        assertFalse(task.equals(task2));
    }

    @Test
    public void hashCodeTest() throws Exception {
        Task322 task2 = new Task322();
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
        int maxSumOfDivisors = 0;
        assertEquals("Task322{" + "maxDel=" + maxSumOfDivisors + ", number=" + number + "}",result);
    }

    @Test
    public void setNumber() throws Exception {
        task.setNumber(1);
        assertEquals(1, task.getNumber());
    }

    @Test
    public void setMaxSumOfDivisors() {
        task.setMaxSumOfDivisors(1);
        assertEquals(1, task.getMaxSumOfDivisors());
    }
}