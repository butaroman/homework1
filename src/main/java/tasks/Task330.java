package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import home.utils.AbstractTask;

/**
 * @author Roman Buta
 */
public class Task330 extends AbstractTask {

    @Override
    public final String solution() throws IOException {
        int n = readPositiveNumber();

        ArrayList<Integer> perfectNumbersList = null;
        try {
            perfectNumbersList = findPerfectNumbers(n);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return "Perfect numbers less than " + n + " :"
                + perfectNumbersList;
    }
	@Override
	public String getTaskNumber() {
		return "330";
	}

	@Override
	public String getTaskCondition() {
		return "A natural number is perfect if it is equal to the sum of all divisors except itself.\n"
				+ "\"Number 6 is perfect, because 6 = 1+2+3.\n" + "Find all the perfect numbers less than n.";
	}

	/**
	 * @param n
	 *            natural number (must be grater than 0)
	 * @return list of perfect numbers less than n
	 */
	private ArrayList<Integer> findPerfectNumbers(final int n) {
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
