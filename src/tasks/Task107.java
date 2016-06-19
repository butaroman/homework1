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
    public void solution() {
        try {
            number = readPositiveNumber();
        } catch (IOException e) {
            return;
        }
        calculate();
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
    public final void calculate() {
        int k = 0;
        while (Math.pow(BASE, k) < number) {
            k++;
        }
        System.out.println("k = " + (k - 1));
    }

}
