package tasks;

import java.io.IOException;
import java.util.ArrayList;
import home.utils.AbstractTask;

/**
 * The {@code tasks.Task561} class represents calculate of the task561.
 *
 * @author aska Created 15.06.2016.
 */
public class Task561 extends AbstractTask {

    @Override
    public String solution() throws IOException {
        int n = readPositiveNumber();

        ArrayList<Integer> arrayList = findNumbersFinishedWithSquareNumber(n);
        return answerToString(arrayList);
    }


	@Override
	public String getTaskNumber() {
		return "561";
	}

	@Override
	public String getTaskCondition() {
		return "Given a natural number n. Find all numbers among the numbers 1, ..., n "
				+ "which last digits of their records match the last digits of the records of their squares."
				+ "                 \"(For example, 6^2 = 36 25^2 = 625, and so on).";
	}

	/**
	 * This private method solves task 561.
	 *
	 * @param n
	 *            incoming positive number
	 * @return {@code ArrayList<Integer>} collection of elements with value
	 *         matches the last digits of record of its square
	 * @throws IllegalArgumentException
	 *             if param isn't positive
	 */
	public ArrayList<Integer> findNumbersFinishedWithSquareNumber(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("Invalid parameter, n must be positive.");
		}
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (isFinishedWithSquareNumber(i)) {
				result.add(i);
			}
		}

		return result;
	}

	/**
	 * This private method is for internal usage.
	 *
	 * @param n
	 *            incoming positive number
	 * @return {@code true} if record of param value matches the last digits of
	 *         record of its square, otherwise {@code false}
	 * @throws IllegalArgumentException
	 *             if param isn't positive
	 */
	public boolean isFinishedWithSquareNumber(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Invalid parameter, n must be positive.");
		}
		String s = "" + (int) Math.pow(n, 2);
		return s.endsWith("" + n);
	}

	/**
	 * This private method is for internal usage. Provide readable answer to the
	 * task.
	 *
	 * @param arrayList
	 *            {@code ArrayList<Integer>} collection of elements need to be
	 *            converted into String
	 * @return {@code String} readable answer
	 */
	public String answerToString(ArrayList<Integer> arrayList) {
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
