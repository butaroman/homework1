package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import home.utils.AbstractTask;

/**
 * Created by nataliia on 18.06.16.
 */
public class Task559 extends AbstractTask { // Mersenne prime

    @Override
    public String solution() throws IOException {

        int n = readPositiveNumber();

        ArrayList<Integer> arrayList = calc(n);
        return answerToString(arrayList);
    }

    @Override
    public String getTaskNumber() {
        return "559";
    }

    @Override
    public String getTaskCondition() {
        return "Given a positive number n. Find all Mersenne primes smaller than n. "
                + "(A prime number is called a Mersenne prime, if it can be represented in the form 2p - 1, \n"
                + "where p - is also a prime number.";
    }

    ArrayList<Integer> calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid parameter, n must be positive.");
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        int num = 0;
        int p = 2;
        while (num < n) {
            num = (int) (Math.pow(2, p) - 1);
            if (isPrime(p) && num <= n) {
                result.add(num);
            }
            p++;
        }
        return result;
    }

    private boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

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
