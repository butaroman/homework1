package tasks;

import java.io.IOException;
import home.utils.AbstractTask;

/**
 * @author Roman Buta
 */
public class Task86a extends AbstractTask {


	@Override
	public String solution() throws IOException {
		int n = readPositiveNumber();
		int countLength = 0;
		try {
			countLength = countNumberLength(n);
		} catch (IllegalArgumentException e) {
			throw e;
		}

		return "Natural number " + n + " includes " + countLength + " digits.";

	}

	@Override
	public String getTaskNumber() {
		return "86a";
	}

	@Override
	public String getTaskCondition() {
		return "How many digits in the natural number n?";
	}

	/**
	 * @param n natural number (must be grater than 0)
	 * @return count of digits
	 */
	public int countNumberLength(final int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("n must be greater than 0.");
		}
		return Integer.toString(n).length();
	}
}