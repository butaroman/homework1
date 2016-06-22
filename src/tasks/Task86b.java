package tasks;

import java.io.IOException;
import home.utils.AbstractTask;

/**
 * @author Roman Buta
 */
public class Task86b extends AbstractTask {

	/**
	 * ASCII code for '0'.
	 */
	public static final int ASCII_0 = 48;

	@Override
	public final String solution() throws IOException{

		int n  = readPositiveNumber();

		int sum = addNumberSum(n);


		return "Sum of the digits of a natural number " + n + " = " + sum;
	}

	@Override
	public String getTaskNumber() {
		return "86b";
	}

	@Override
	public String getTaskCondition() {
		return "Calculate sum of the digits of a natural number.";
	}

	/**
	 * @param n
	 *            natural number (must be grater than 0)
	 * @return sum of digits
	 */
	private int addNumberSum(final int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("n must be greater than 0.");
		}
		char[] arr = Integer.toString(n).toCharArray();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] - ASCII_0;
		}
		return sum;
	}
}
