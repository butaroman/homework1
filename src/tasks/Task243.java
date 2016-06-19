package tasks;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Oleg
 * @version 1
 */
public class Task243 extends Task {
	/**
	 * Number from IO.
	 */
	private int number;
	/**
	 * @param n
	 *Constructor with 1 int param.
	 */
	public Task243(final int n) {
		this.number = n;
	}
	/**
	 * Default constructor.
	 */
	public Task243() {
		
	}


	@Override
	public void solution(){
		try {
			number = readPositiveNumber();
		} catch (IOException e) {
			return;
		}
		System.out.println("subtask a");
		calculateA();
		System.out.println("subtask b");
		calculateB();
	}

	@Override
	public String getTaskNumber() {
		return "243";
	}

	@Override
	public String getTaskCondition() {
		return ":)"; //// TODO: 20.06.2016 translate task243 condition
	}
	

/**
 * calculating subtask(a).
 * find one pair when x^2+y^2=n
 */
	public final void calculateA() {
		System.out.println("find one pair when x^2+y^2=n");
		boolean valid = false;
		for (int i = 1; i <= (int) Math.sqrt(number); i++) {
			for (int j = i; j <= (int) Math.sqrt(number); j++) {
				if (i * i + j * j == number && (i!=j)) {
					System.out.println(i * i + " + " + j * j + " = " + number);
					valid = true;
					break;
				}
			}
		}
		if (!valid){
			System.out.println("number can't be decomposed");
		}
	}
/**
 * calculating subtask(b).
 * find all pairs when x^2+y^2=n, x >= y.
 */
	public final void calculateB() {
		System.out.println("find all pairs when x^2+y^2=n, x >= y.");
		boolean valid = false;
		for (int i = (int) Math.sqrt(number); i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (i * i + j * j == number) {
					valid = true;
					System.out.println(i * i + " + " + j * j + " = " + number);
				}
			}
		}
		if (!valid) {
			System.out.println("number can't be decomposed");
		}
	}

}
