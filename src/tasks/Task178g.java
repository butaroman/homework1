package tasks;

import java.util.Random;
import java.util.Scanner;

import home.utils.AbstractTask;

/**
 * This class is resolving my first task in book,task number is 178.
 *
 * @author cavayman
 */
public class Task178g extends AbstractTask {

    // variables
    private static Random rand = new Random();
    private static int[] mas;
    private static Scanner scan = new Scanner(System.in);
    private static int firstCounter = 0;

    /**
     * Main method that fills massive and scanns that user enters.
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

        for (int i = 0; i < mas.length; i++) {
            first(mas, i);
        }
        return "Count="+firstCounter;

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





    @Override
    public String getTaskNumber() {
        // TODO Auto-generated method stub
        return "178g";
    }

    @Override
    public String getTaskCondition() {
        // TODO Auto-generated method stub
        return "Given massive of numbers with size n,a1...an.Write count of numbers Ak  from  sequence that are satisfying.\n" +
                "G)Ak<(Ak-1+Ak+1)/2"
                ;
    }
}
