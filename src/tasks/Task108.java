package tasks;

import java.io.IOException;
import home.utils.AbstractTask;

/**
 * The {@code tasks.Task108} class represents calculate of the task108.
 *
 * @author aska Created on 15.06.2016.
 */

public class Task108 extends AbstractTask {

    @Override
    public String solution() throws IOException {
        int n = readPositiveNumber();
        int r = 0;
        try {
            r = calc(n);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return "";
        }
        return "2^" + r + "=" + (int) Math.pow(2, r);
    }

	@Override
	public String getTaskNumber() {
		return "108";
	}

	@Override
	public String getTaskCondition() {
		return "Given a natural number n. Get the smallest number represented as 2^r higher than n.";
	}

	/**
	 * This private method finds perform calculation. Finds min number
	 * represented as 2^r that is greater than n.
	 *
	 * @param n
	 *            incoming positive number
	 * @return {@code int} number represented as 2^r that is greater than n
	 * @throws IllegalArgumentException
	 *             if param n isn't positive
	 */
	private int calc(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Invalid parameter, n must be positive.");
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
