package tasks;

import java.io.IOException;
import home.utils.AbstractTask;

/**
 * Created by nataliia on 18.06.16.
 */
public class Task87 extends AbstractTask {

    @Override
    public String solution() throws IOException {

        int n = readPositiveNumber("n");

        int m = readPositiveNumber("m");


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
