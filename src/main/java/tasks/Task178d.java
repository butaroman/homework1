package tasks;

import home.utils.AbstractTask;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by cavayman on 21.06.2016.
 */
public class Task178d extends AbstractTask {

    // variables
    private static Random rand = new Random();
    private static int[] mas;
    private static Scanner scan = new Scanner(System.in);
    private static int secondCounter = 0;

    @Override
    public String solution() throws Exception {
        System.out.println("Enter quantity of numbers in massive:");
        int sizeOfMassive = scan.nextInt();
        mas = new int[sizeOfMassive];
        System.out.println();

        for (int i = 0; i < mas.length; i++) { // setting state of massive.
            mas[i] = rand.nextInt(50);

            System.out.print(mas[i] + " ");
        }
        for (int i = 0; i < mas.length; i++) {
            second(mas, i);
        }
        return "Count="+secondCounter;
    }

    /**
     * Method is resolving second task 178(D) counts numbers that (2^k<Ak<k!).
     *
     * @param temp           our massive in which we will search.
     * @param iterationCount an iteration number.
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
     * @param num param from which you whant get factorial.
     * @return an factorial number.
     */
    public static int fact(int num) {
        return (num == 0) ? 1 : num * fact(num - 1);
    }

    @Override
    public String getTaskNumber() {
        return "178d";
    }

    @Override
    public String getTaskCondition() {
        return "\"Given massive of numbers with size n,a1...an.Write count of numbers Ak  from  sequence that are satisfying.\\n\" +\n" +
                "                \"D) 2^k<Ak<K!";
    }
}
