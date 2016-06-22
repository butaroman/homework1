import org.testng.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Task86a;

/**
 * Created by Aska on 21.06.2016.
 */
public class Task86aTest {
    Task86a task86a;

    @BeforeTest
    void initialiseTaskPbject() {
        task86a = new Task86a();
    }

    @Test(dataProvider = "validNumbersProvider")
    public void testCountNumberLength(int argument, int expectedValue) {
        int realValue = task86a.countNumberLength(argument);
        Assert.assertEquals(expectedValue, realValue);
    }

    @DataProvider
    public Object[][] validNumbersProvider() {
        return new Object[][]{{100, 3}, {20, 2}, {10000, 5}, {8880, 4}};
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = ".*n must be .*")
    public void testCountNumberLengthForInvalidParam(){
        int[] invalidParameters = {-5, -2, 0, -100};
        for (int i = 0; i < invalidParameters.length; i++) {
            task86a.countNumberLength(invalidParameters[i]);
        }
    }

    @Test
    public void testTaskNumber(){
        Assert.assertEquals("86a", task86a.getTaskNumber());
    }

    @Test
    public void testTaskCondition(){
        String task = task86a.getTaskCondition();
        Assert.assertTrue(task.contains("digits in the natural number"));
    }
}
