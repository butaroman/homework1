package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Roman Buta
 */
public class Task86a implements Task {

    @Override
    public final void solution() {
        System.out.println("Task №86a: ");
        System.out.println("How many digits in the natural number n?");
        System.out.println("Enter natural number:");

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("It has to be natural number!!!");
        }

        int countLength = 0;
        try {
            countLength = countNumberLength(n);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Natural number " + n + " includes " + countLength
                + " digits.");
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
