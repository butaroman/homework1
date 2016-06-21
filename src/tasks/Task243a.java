package tasks;

import java.io.IOException;
import java.util.Scanner;

import home.utils.AbstractTask;

/**
 * @author Oleg
 * @version 1
 */
public class Task243a extends AbstractTask {
	/**
	 * Number from IO.
	 */
	private int number;

	/**
	 * @param n Constructor with 1 int param.
	 */
	
	public Task243a(final int n) {
		this.number = n;
	}



	/**
	 * Default constructor.
	 */
	public Task243a() {

	}

	@Override
	public String solution() throws IOException {

		number = readPositiveNumber();

		return "" + calculateA();
	}

	@Override
	public String getTaskNumber() {
		return "243a";
	}

	@Override
	public String getTaskCondition() {
		return "Given a positive number n. Is it possible to represent it "
				+ "as a sum of two squares of integers? If possible,find one pair when x^2+y^2=n";
	}

	/**
	 * calculating subtask(a). find one pair when x^2+y^2=n
	 */
	public final String calculateA() {
		String result = "";
		boolean valid = false;
		for (int i = 1; i <= (int) Math.sqrt(number); i++) {
			for (int j = i; j <= (int) Math.sqrt(number); j++) {
				if (i * i + j * j == number && (i != j)) {
					result = i + "*" + i + " + " + j + "*" + j + " = " + number;
					valid = true;
					break;
				}
			}
		}
		if (!valid) {
			result = "number can't be decomposed";
		}
		return result;
	}

}
