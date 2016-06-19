package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/** The {@code tasks.Task325} class represents calculate of the task325.
 * @author aska
 * Created on 15.06.2016.
 */
public class Task325 extends Task {

    @Override
    public String solution() {
        int n = 0;

        try {
            n = readPositiveNumber();
        } catch (IOException e) {
            return "";
        }

        ArrayList<Integer> arrayList = findPrimeDividers(n);
        return answerToString(arrayList);
    }

    @Override
    public String getTaskNumber() {
        return "325";
    }

    @Override
    public String getTaskCondition() {
        return "Given a positive number n. Get all the prime divisors of this number.";
    }

    /** This private method finds prime dividers of n.
     * @param n incoming positive number
     * @return {@code ArrayList<Integer>} collection of prime dividers
     * @throws IllegalArgumentException if param n isn't positive
     */
    private ArrayList<Integer> findPrimeDividers(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid parameter, n must be positive.");
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) result.add(i);
        }
        return result;
    }


    /** This private method is for internal usage.
     * Method checks whether number is prime
     * @param n incoming positive number
     * @return {@code true} if n is prime number, otherwise
     * {@code false}
     * @throws IllegalArgumentException if param isn't positive
     */
    private boolean isPrime(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid parameter, n must be positive.");
        }
        else if (n == 0 || n == 1) return false;
        else if (n == 2) return true;
        else for (int i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
                if (n % i == 0) return false;
            }
        return true;
    }

    /**
     * This private method is for internal usage.
     * Provide readable answer to the task.
     *
     * @param arrayList {@code ArrayList<Integer>} collection of elements need to be converted into String
     * @return {@code String} readable answer
     */
    private String answerToString(ArrayList<Integer> arrayList) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            answer.append(arrayList.get(i));
            if (i == arrayList.size() - 1) {
                answer.append(".");
            } else {
                answer.append(", ");
            }
        }
        return answer.toString();
    }
}
