package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Roman Buta
 */
public class Task86a extends Task {

    @Override
    public final String solution() {
        int n = 0;
        try {
            n = readPositiveNumber();
        } catch (IOException e) {
            return "";
        }

        int countLength = 0;
        try {
            countLength = countNumberLength(n);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return "Natural number " + n + " includes " + countLength + " digits.";
    }

    @Override
    public String getTaskNumber() {
        return "86a";
    }

    @Override
    public String getTaskCondition() {
        return "How many digits in the natural number n?";
    }

    /**
     * @param n natural number (must be grater than 0)
     * @return count of digits
     */
    private int countNumberLength(final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0.");
        }
        return Integer.toString(n).length();
    }
}
