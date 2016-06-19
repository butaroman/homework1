package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Roman Buta
 */
public class Task86b implements Task {

    /**
     * ASCII code for '0'.
     */
    public static final int ASCII_0 = 48;

    @Override
    public final void solution() {
        System.out.println("Task №86 б: ");
        System.out.println("Calculate sum of the digits of a natural number.");
        System.out.println("Enter natural number: ");

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("It has to be natural number!!");
        }

        int sum = 0;
        try {
            sum = addNumberSum(n);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Sum of the digits of a natural number " + n
                + " = " + sum);
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
