package tasks;
import java.io.IOException;

/**
 * @author Oleg
 * @version 1
 */
public class Task243b extends Task {
	/**
	 * Number from IO.
	 */
	private int number;
	/**
	 * @param n
	 *Constructor with 1 int param.
	 */
	public Task243b(final int n) {
		this.number = n;
	}
	/**
	 * Default constructor.
	 */
	public Task243b() {
		
	}


	@Override
	public String solution(){
		try {
			number = readPositiveNumber();
		} catch (IOException e) {
			return "";
		}
		return "" + calculateB();
	}

	@Override
	public String getTaskNumber() {
		return "243b";
	}

	@Override
	public String getTaskCondition() {
		return "Given a positive number n. Is it possible to represent it " +
				"as a sum of two squares of integers? If possible, find all pairs when x^2+y^2=n, x >= y.";
	}

/**
 * calculating subtask(b).
 * find all pairs when x^2+y^2=n, x >= y.
 */
	public final String calculateB() {
		String result = "";
		boolean valid = false;
		for (int i = (int) Math.sqrt(number); i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (i * i + j * j == number) {
					valid = true;
					result = i + "*" + i + " + " + j + "*" + j + " = " + number;
				}
			}
		}
		if (!valid) {
			result = "number can't be decomposed";
		}
		return result;
	}

}
