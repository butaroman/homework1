package tasks;
import java.util.Scanner;
import tasks.Task;
/**
 * 
 * @author Oleg
 *
 */
public class Task107 implements Task {
	/**
	 * Base.
	 */
	private static final int BASE = 4;
	/**
	 * Number from IO.
	 */
	private int number;
	/**
	 * Read number from keyboard.
	 */
	public final void readData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Input positive number");
		try {
			number = Integer.parseInt(in.next());
		} catch (NumberFormatException e) {
			System.out.println("Wrong number");
		}
		in.close();
	}
	
	@Override
	public void solution(){
	readData();
	calculate();
	}
	/**
	 * find maximum k where 4^k<m.
	 */
	public final void calculate() {
		System.out.println(" find maximum k where 4^k<m");
		int k = 0;
		while (Math.pow(BASE, k) < number) {
			k++;
		}
		System.out.println("k = " + (k - 1));
	}
	
}
