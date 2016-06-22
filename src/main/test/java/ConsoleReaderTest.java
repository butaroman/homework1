import home.utils.ConsoleReader;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nazar.dovhyy on 21.06.2016.
 *
 * use case:
 *
 * supposedly we need to somehow test our void methods
 *
 * How do we do that?
 *
 * well.... we can actually read and test the output from the System.out.println
 *
 * and this code below shows how to test output from System.out.print
 *
 * WARNING: runs properly only with JUnit
 */
public class ConsoleReaderTest {

    private ConsoleReader consoleReader = new ConsoleReader();

    /**
     * this code below is self explanatory
     */
    @Test
    public void testSysOut(){

        someVoidMethodToTest();

        String sysOutputString = consoleReader.captureSysOut();

        //recommended to use with separator
        String separator = System.getProperty("line.separator");

        Assert.assertEquals("Hello"+separator, sysOutputString);
    }

    /**
     * this is a method that we need to test
     */
    private void someVoidMethodToTest() {
        System.out.println("Hello");
    }
}
