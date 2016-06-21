package tasks;

import java.util.Random;
import java.util.Scanner;

import home.utils.AbstractTask;

/**
 * This class is resolving my first task in book,task number is 178.
 * 
 * @author cavayman
 *
 */
public class Task178 extends AbstractTask {

	// variables
	private static Random rand = new Random();
	private static int[] mas;
	private static Scanner scan = new Scanner(System.in);
	private static int firstCounter = 0;
	private static int secondCounter = 0;

	/**
	 * Main method that fills massive and scanns that user enters.
	 * 
	 * @param args
	 *            Default parameter.
	 */
	public String solution() {
		System.out.println("Enter quantity of numbers in massive:");
		int sizeOfMassive = scan.nextInt();
		mas = new int[sizeOfMassive];
		System.out.println();

		for (int i = 0; i < mas.length; i++) { // setting state of massive.
			mas[i] = rand.nextInt(50);
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		System.out.println("first:");
		for (int i = 0; i < mas.length; i++) {
			first(mas, i);
		}
		System.out.println("FirstCounter=" + firstCounter);
		System.out.println("Second:");

		for (int i = 0; i < mas.length; i++) {
			second(mas, i);
		}
		System.out.println("SecondCounter=" + secondCounter);
		return "Це відповіді на Г та Д завдання";

	}

	/**
	 * Method is resolving first task 178(G) counts numbers that ( Ak<((Ak-1 +
	 * Ak+1)/2).
	 * 
	 * @param temp
	 * @param iterationCount
	 */
	public static void first(int[] temp, int iterationCount) {
		System.out.print(" ");
		if (iterationCount > 0) {
			if (iterationCount < temp.length - 1) {
				if (temp[iterationCount] < ((temp[iterationCount - 1] + temp[iterationCount + 1]) / 2)) {
					System.out.print(temp[iterationCount] + " ");
					firstCounter++;
				}
			}
		}
	}

	/**
	 * Method is resolving second task 178(D) counts numbers that (2^k<Ak<k!).
	 * 
	 * @param temp
	 *            our massive in which we will search.
	 * @param iterationCount
	 *            an iteration number.
	 */
	public static void second(int[] temp, int iterationCount) {
		if (iterationCount > 0) {
			if (iterationCount < temp.length - 1) {
				if ((Math.pow(2, iterationCount) < temp[iterationCount])
						&& (temp[iterationCount] < fact(iterationCount))) {
					System.out.print(temp[iterationCount] + " ");
					secondCounter++;
				}
			}
		}
	}

	/**
	 * Method for factorial
	 * 
	 * @param num
	 *            param from which you whant get factorial.
	 * @return an factorial number.
	 */
	public static int fact(int num) {
		return (num == 0) ? 1 : num * fact(num - 1);
	}

	@Override
	public String getTaskNumber() {
		// TODO Auto-generated method stub
		return "178";
	}

	@Override
	public String getTaskCondition() {
		// TODO Auto-generated method stub
		return "Даны натуральные числа n,a1,...,an.\n Определить количесво членов Ak последовательности.";
	}
}
