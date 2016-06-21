package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import home.utils.AbstractTask;

/**
 * Created by nataliia on 18.06.16.
 */

public class Task323 extends AbstractTask {

    @Override
    public String solution() throws IOException {
        int n = readPositiveNumber();


		ArrayList<Integer> arrayList = calc(n);
		return answerToString(arrayList);
	}

	@Override
	public String getTaskNumber() {
		return "323";
	}

	@Override
	public String getTaskCondition() {
		return "Given a natural number n. Get all the natural numbers less than n and relatively prime to it.";
	}

	ArrayList<Integer> calc(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Invalid parameter, n must be positive.");
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int num = 1; num <= n; num++) {
			if (isPrime(num) && gcd(num, n) == 1) {
				result.add(num);
			}
		}
		return result;
	}

	private boolean isPrime(int n) {
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	private int gcd(int a, int b) { // НСД
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
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
