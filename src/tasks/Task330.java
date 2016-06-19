package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Roman Buta
 */
public class Task330 implements Task {

    @Override
    public final void solution() {
        System.out.println("Task №330: ");
        System.out.println("A natural number is perfect "
                + "if it is equal to the sum of all divisors except itself.");
        System.out.println("Number 6 is perfect, because 6 = 1+2+3.");
        System.out.println("Number 8 - is not perfect, because 8 != 1+2+4.");
        System.out.println("Find all the perfect numbers less than n.");

        System.out.println("Enter natural number: ");

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("It has to be natural number!!!");
        }
        ArrayList<Integer> perfectNumbersList = null;
        try {
            perfectNumbersList = findPerfectNumbers(n);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Perfect numbers less than " + n + " :"
                + perfectNumbersList);
    }

    /**
     * @param n natural number (must be grater than 0)
     * @return list of perfect numbers less than n
     */
    private  ArrayList<Integer> findPerfectNumbers(final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0.");
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                list.add(i);
            }
        }
        return list;
    }
}
