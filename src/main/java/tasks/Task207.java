package tasks;


import home.utils.AbstractTask;

public class Task207 extends AbstractTask {

	@Override
	public String getTaskNumber() {
		return "207";
	}

	@Override
	public String getTaskCondition() {
		return "Given a natural number n. Throw from the record number n "
				+ "digits 0 and 5, leaving the rest of the same order of digits. "
				+ "For example, from number 59015509 should have 919.";
	}

	@Override
	public String solution() throws Exception {
		
		return Integer.toString(formatter(readPositiveNumber()));
	}

	public int formatter(int entredNumber) {
		int result = 0, i = 1;
		while (entredNumber != 0) {
			if ((entredNumber % 10 != 5) && (entredNumber % 10 != 0)) {
				result += (entredNumber % 10) * i;
				i *= 10;
			}
			entredNumber /= 10;
		}

		return result;
	}

}
