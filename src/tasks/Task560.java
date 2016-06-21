package tasks;

import java.util.ArrayList;
import java.util.List;

import home.utils.AbstractTask;

/**
 * Created by nazar.dovhyy on 20.06.2016.
 */
public class Task560 extends AbstractTask {

	private static final int START_FROM = 200;
	private static final int END_WITH = 300;

	@Override
	public String solution() {

		String output = null;
		List<Integer> friendlyNumbersList = getAllFriendlyNumbers();
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < friendlyNumbersList.size(); i++) {

			output = getFormattedOutput(i, friendlyNumbersList, builder).toString();
		}

		return output;

	}

	@Override
	public String getTaskNumber() {
		return "560";
	}

	@Override
	public String getTaskCondition() {
		return "Find all pairs of friendly numbers within the following scope (200-300).";
	}

	private StringBuilder getFormattedOutput(int index, List<Integer> allPrimeNumbers, StringBuilder builder) {

		return (index < allPrimeNumbers.size() - 1) ? builder.append(allPrimeNumbers.get(index)).append(", ")
				: builder.append(allPrimeNumbers.get(index)).append(".");
	}

	public List<Integer> getAllFriendlyNumbers() {

		List<Integer> allFriendlyNumbers = new ArrayList<>();

		for (int i = START_FROM; i < END_WITH; i++) {

			if (checkIfFriendly(i) == END_WITH) {
				allFriendlyNumbers.add(i);
			}

		}

		return allFriendlyNumbers;
	}

	private int checkIfFriendly(int number) {

		int result = 1;

		for (int i = 2; i < number / 2; i++) {

			if (number % i == 0) {
				result += i;
			}

		}

		return result;
	}
}
