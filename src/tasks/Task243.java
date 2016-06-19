package com.softserve.edu;
import tasks.Task;
import java.util.Scanner;
/**
 * @author Oleg
 * @version 1
 */
public class Task243 implements  Task {
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
/**
 * @return number from IO.
 */


	/**
	 * Input data from keyboard.
	 */
	public final void readData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Input positive  number");
		try {
			number = Integer.parseInt(in.next());
		} catch (NumberFormatException e) {
			System.out.println("Wrong number");
		}
		in.close();
	}
	/**
	 * @param n  set new value to n.
	 *
	 */
	
	@Override
	public void solution(){
		readData();
		System.out.println("subtask a");
		calculateA();
		System.out.println("subtask b");
		calculateB();
	}
	
	/*
	 * private boolean isValid() { if (isSimple()&&(number%4==1)) return true;
	 * else return false; }
	 */
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
