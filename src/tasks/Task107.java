package tasks;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Oleg
 */
public class Task107 extends Task {
    /**
     * Base.
     */
    private static final int BASE = 4;
    /**
     * Number from IO.
     */
    private int number;

    @Override
    public String solution() {
        try {
            number = readPositiveNumber();
        } catch (IOException e) {
            return "";
        }
        return "" + calculate();
    }

    @Override
    public String getTaskNumber() {
        return "107";
    }

    @Override
    public String getTaskCondition() {
        return "find maximum k where 4^k<m";
    }

    /**
     * find maximum k where 4^k<m.
     */
    public final String calculate() {
        int k = 0;
        while (Math.pow(BASE, k) < number) {
            k++;
        }
        return "k = " + (k - 1);
    }

}
