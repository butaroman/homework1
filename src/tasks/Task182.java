package tasks;


import java.io.IOException;

/**
 * Created by nazar.dovhyy on 20.06.2016.
 */
public class Task182 extends Task {

    /**
     * first condition.
     */
    private static final int CONDITION_FIRST =5;
    /**
     * second condition.
     */
    private static final int CONDITION_SECOND = 7;
    /**
     * array of int numbers.
     */
    private int[] arrOfNumbs;

    @Override
    public String solution() {
        int n = 0;
        try {

            n = readPositiveNumber();
        } catch (IOException e) {
            return "";
        }

        try {
            int sum = findSumOnConditionFor(n);
            return "" + sum;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "\n");
        }
        return "";
    }

    @Override
    public String getTaskNumber() {
        return "182";
    }

    @Override
    public String getTaskCondition() {
        return "Given a natural number of n,"
                + " find sum of all numbers (a1....a(n)) divided by 5 and not divided by 7.";
    }

    /**
     * fid sum of numbers matching the following condition:
     * elem %5 == 0 && elem % 7 != 0
     * where elem is a number within a predefined scope of numbers (1.....number).
     * @param number a length of the array to be filled with numbers (1......number)
     * @return sum of elements matching the following condition elem %5 == 0 && elem % 7 != 0
     */
    private int findSumOnConditionFor(int number) {

        int sum = 0;

        fillArrayOfNumbers(number);

        for (int i = 0; i < arrOfNumbs.length; i++) {


            if (i % CONDITION_FIRST == 0 && i % CONDITION_SECOND != 0) {
                sum += i;
            }

        }

        return sum;
    }

    /**
     * this method checks the validity of an input parameter and calls fillInArrayWithNumbers
     * to fill the array with numbers within a specified scope.
     *
     * @param number a length of the array to be filled with numbers (1......number)
     * @see checkForValidBoundaries
     * @see fillInArrayWithNumbers
     */
    private void fillArrayOfNumbers(int number) {

        checkForValidBoundaries(number);

        fillInArrayWithNumbers(number);

    }

    /**
     * this method fills in the array of numbers with numbers within a valid scope.
     *
     * @param scope a positive number (scope > 0)
     */
    private void fillInArrayWithNumbers(int scope) {

        int count = 0;

        arrOfNumbs = new int[scope];

        while (count < scope) {
            arrOfNumbs[count++] = count;
        }

    }

    /**
     * this method check the validity of the input parameter.
     * @param scope a positive number (scope > 0)
     */
    private void checkForValidBoundaries(int scope) {
        if (scope <= 0) {
            throw new IllegalArgumentException("wrong array bounds specified: "
                    + scope);
        }

    }
}
