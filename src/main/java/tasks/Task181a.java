package tasks;

import java.util.ArrayList;

import home.utils.AbstractTask;

public class Task181a extends AbstractTask {

	private static final int NUMBER = 5;

	@Override
	public String getTaskNumber() {
		return "181a";
	}

	@Override
	public String getTaskCondition() {
		return "Given integers a1, ..., a50. Receive the sum of the numbers of the sequence that" + "multiples of 5;";
	}

	@Override
	public String solution() throws Exception {	
		return Integer.toString(getMultiplesOfFive(0,50));

	}

	public int getMultiplesOfFive(int start, int end) {
		int sumOfMultiples = 0;
		ArrayList<Integer> multiples = new ArrayList<Integer>();
		ArrayList<Integer> numberToCheck = new ArrayList<Integer>();
		for (int i = start; i <= end; i++) {
			numberToCheck.add(i);
			if (numberToCheck.get(i) % NUMBER == 0) {
				multiples.add(numberToCheck.get(i));
			}
		}

		for (int i = 0; i < multiples.size(); i++) {
			sumOfMultiples += multiples.get(i);
		}
		return sumOfMultiples;
	}
	
	
	
}
