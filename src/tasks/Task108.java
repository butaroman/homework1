package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The {@code tasks.Task108} class represents calculate of the task108.
 *
 * @author aska
 *         Created on 15.06.2016.
 */

public class Task108 implements Task {

    @Override
    public void solution() {
        Helper helper = new Helper();
        helper.printTask("108", "Дано натуральное число n. \" +\n" +
                "                \"Получить наименьшее число вида 2^r,\" +\n" +
                "                \"превосходящее n.");
        int n = helper.getIntInput();

        int r = 0;
        try {
            r = calc(n);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        helper.printSolution("2^" + r + "=" + (int) Math.pow(2, r));
    }

    /**
     * This private method finds perform calculation.
     * Finds min number represented as 2^r that is greater than n.
     *
     * @param n incoming positive number
     * @return {@code int} number represented as 2^r that is greater than n
     * @throws IllegalArgumentException if param n isn't positive
     */
    private int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Введіть коректне значення, n не може бути від'ємним.");
        }
        int r = 0;
        int result;
        while (true) {
            if (Math.pow(2, r) > n) {
                result = r;
                break;
            } else {
                r++;
            }
        }
        return result;
    }
}


