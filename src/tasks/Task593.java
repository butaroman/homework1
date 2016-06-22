package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import home.utils.AbstractTask;

public class Task593 extends AbstractTask {

	@Override
	public String getTaskNumber() {
		return "593";
	}

	@Override
	public String getTaskCondition() {
		return "Given a positive integer m (m <27). "
				+ "Get all three-digit positive integers whose sum of digits equal to m.";
	}

	@Override
	public String solution() throws Exception {
		return Integer.toString(calc(readPositiveNumber()));
	}

	public int calc(int m) {
		int result = 0;
		if ((m <= 1) && (m >= 27)) {
			throw new IllegalArgumentException("Invalid parameter, m must be 0<m<=27.");
		}
			for (int i = 100; i < 1000; i++) {
				if (m == getSumOfThreeDigit(i)) 
					System.out.println("Answer is:" + i);
			}
		return result;
	}

	public int getSumOfThreeDigit(int i) {
		int sumOfThreeDigit = 0;
		sumOfThreeDigit += (i % 10);
		i = i / 10;
		sumOfThreeDigit += (i % 10);
		i = i / 10;
		sumOfThreeDigit += i;
		return sumOfThreeDigit;
	}

	@Override
	public int readPositiveNumber(String variableName) throws IOException {
		System.out.println("Enter number from 0 to 27: ");

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		try {
			n = Integer.parseInt(bufferedReader.readLine());
		} catch (IOException e) {
			System.out.println("Can't get input data.");
			throw e;
		} catch (NumberFormatException e) {
			System.out.println("Non a number.");
			throw e;
		}
		return n;
	}

}
