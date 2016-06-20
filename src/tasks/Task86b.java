package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Roman Buta
 */
public class Task86b extends Task {

    /**
     * ASCII code for '0'.
     */
    public static final int ASCII_0 = 48;

    @Override
    public final String solution() {

        int n = 0;
        try {
            n = readPositiveNumber();
        } catch (IOException e) {
            return "";
        }

        int sum = 0;
        try {
            sum = addNumberSum(n);
        } catch (IllegalArgumentException e) {
                throw e;
        }

        return "Sum of the digits of a natural number " + n
                + " = " + sum;
    }

    @Override
    public String getTaskNumber() {
        return "86b";
    }

    @Override
    public String getTaskCondition() {
        return "Calculate sum of the digits of a natural number.";
    }

    /**
     * @param n natural number (must be grater than 0)
     * @return sum of digits
     */
    private int addNumberSum(final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0.");
        }
        char[] arr = Integer.toString(n).toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] - ASCII_0;
        }
        return sum;
    }
}
