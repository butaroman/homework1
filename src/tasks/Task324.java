package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import home.utils.AbstractTask;

/**
 * Created by nazar.dovhyy on 20.06.2016.
 */
public class Task324 extends AbstractTask {

	private int[] arr;

	@Override
	public String solution() {
		int n = 0;
		try {

			n = readPositiveNumber();
		} catch (IOException e) {
			return "";
		}

		String output = null;
		List<Integer> allPrimeNumbers = findAllPrimeNumbersFor(n);
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < allPrimeNumbers.size(); i++) {

			output = getFormattedOutput(i, allPrimeNumbers, builder).toString();
		}

		return output;
	}

	@Override
	public String getTaskNumber() {
		return "324";
	}

	@Override
	public String getTaskCondition() {
		return "Given a natural number n. Find all numbers less than n being mutually prime with n.";
	}

	private StringBuilder getFormattedOutput(int index, List<Integer> allPrimeNumbers, StringBuilder builder) {

		return (index < allPrimeNumbers.size() - 1) ? builder.append(allPrimeNumbers.get(index)).append(", ")
				: builder.append(allPrimeNumbers.get(index)).append(".");
	}

	private List<Integer> findAllPrimeNumbersFor(int number) {

		fillArrayHolder(number);

		return primeNumbersForN(number);
	}

	private List<Integer> primeNumbersForN(int number) {

		List<Integer> primeNumbers = new ArrayList<>();

		for (int i = number; i < number + 1; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (retPrimeNumber(i, arr[j]) == 1) {

					primeNumbers.add(arr[j]);
				}

			}
		}

		return primeNumbers;
	}

	private int retPrimeNumber(int firstNum, int secNum) {

		if (firstNum % secNum == 0) {
			return secNum;
		}

		return retPrimeNumber(secNum, firstNum % secNum);
	}

	private void fillArrayHolder(int number) {

		if (number < 1) {
			throw new IllegalArgumentException("the input number must be larger than 0");
		}

		arr = new int[number - 1];

		fillArrayHolderWithNumbers(number - 1);

	}

	private void fillArrayHolderWithNumbers(int number) {

		int count = 0;

		while (count < number) {
			arr[count++] = count;
		}

	}
}
