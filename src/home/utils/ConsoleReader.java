package home.utils;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by nazar.dovhyy on 21.06.2016.
 * <p>
 * this code reconfigures the System.out so that it can save the output
 * into a String
 */
public class ConsoleReader {


    private final OutputStream os;
    private final PrintStream printStream;
    private final PrintStream originalOut = System.out;

    /**
     *
     */
    public ConsoleReader() {

        os = new ByteArrayOutputStream();
        printStream = new PrintStream(os);
        System.setOut(printStream);

    }

    /**
     * capturing System.out as a String
     *
     * @return
     */
    public String captureSysOut() {

        String sysOut = os.toString();

        clean();

        return sysOut;
    }

    /**
     * IMPORTANT!
     * returning original System.out configuration
     */
    private void clean() {
        System.setOut(originalOut);
    }


}
