package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nataliia on 18.06.16.
 */
public class Task87 extends Task {

    @Override
    public String solution() throws IOException {

        int n = readPositiveNumber("n");

        int m = 0;
        try {
            m = readPositiveNumber("m");
        } catch (IOException e) {
            return "";
        }

        int r = 0;
        try {
            r = calc(n, m);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return "";
        }
        return "The amount of " + m +" the last digits of number "+ n + " = " + r;
    }

    @Override
    public String getTaskNumber() {
        return "87";
    }

    @Override
    public String getTaskCondition() {
        return "Given positive n and m. Find the sum of m last digits of n.";
    }

    int calc(int n, int m) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid parameter, n must be positive.");
        }
        if (m < 0) {
            throw new IllegalArgumentException("Invalid parameter, m must be positive.");
        }
        int result = 0;
        for (int i = 0; i < m; i++) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
