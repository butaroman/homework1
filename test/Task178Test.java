import home.utils.ConsoleReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Task178;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


/**
 * Created by nazar.dovhyy on 21.06.2016.
 */
public class Task178Test {

    private ConsoleReader consoleReader;
    private Task178 task178;

    int[] dataArray;


    @BeforeClass
    public void setUp() {
        consoleReader = new ConsoleReader();
        task178 = new Task178();
        dataArray = new int[]{12, 15, 24, 21, 46};
    }


    @DataProvider
    public Object[][] factorialValidDataProvider() {

        return new Object[][]{{1, 1}, {0, 1}, {4, 24}, {5, 120}};
    }

    @Test(dataProvider = "factorialValidDataProvider")
    public void testFactorialValid(int argument, int expResult) {

        int actualResult = Task178.fact(argument);

        assertEquals(expResult, actualResult);

    }


    @DataProvider
    public Object[][] invalidArgumentsProvider() {

        return new Object[][]{{new Integer[]{-1, -2, -10, -100, -23456}}};
    }


    @Test(dataProvider = "invalidArgumentsProvider", expectedExceptions = IllegalArgumentException.class)
    public void testFactorialThrowsException(Integer[] arguments) {

        for (int singleArgument : arguments) {
            Task178.fact(singleArgument);
        }
    }


    class MyDataObject {
        private final int[] dataArray;
        private final int count;
        private final int result;

        public MyDataObject(int[] dataArray, int count, int result) {
            this.dataArray = dataArray;
            this.count = count;
            this.result = result;
        }

        public int[] getDataArray() {
            return dataArray;
        }

        public int getCount() {
            return count;
        }

        public int getResult() {
            return result;
        }

        @Override
        public String toString() {
            return "MyDataObject{" +
                    "dataArray=" + Arrays.toString(dataArray) +
                    ", count=" + count +
                    ", result='" + result + '\'' +
                    '}';
        }

    }

    @DataProvider
    public Object[][] dataObjectProvider() {
        return new Object[][]{{new MyDataObject(dataArray, 1, 15)},
                {new MyDataObject(dataArray, -1, 0)},
                {new MyDataObject(dataArray, 3, 21)}};
    }

    @Test(dataProvider = "dataObjectProvider")
    public void testFirstMethod(MyDataObject myDataObject) {

        int actualResult = Task178.first(myDataObject.getDataArray(), myDataObject.getCount());
        assertEquals(myDataObject.getResult(), actualResult);

    }


    @Test
    public void testReadTaskNumber() {
        String taskNumber = task178.getTaskNumber();
        assertEquals("178", taskNumber);

    }

    @Test
    public void taskReadTaskCondition() {
        String taskCondition = task178.getTaskCondition();
        assertTrue(taskCondition.contains("Определить количесво членов Ak последовательности"));
    }


}
