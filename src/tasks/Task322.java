package tasks;

import java.io.IOException;

/**
 * TASK: Find integer from 1 to 10,000
 * with the maximum sum of divisors.
 *
 * @author KarpenkoKO.
 * @version 1.0.
 */
public class Task322 extends Task {

    /**
     * @param maxSumOfDivisors save max sum of divisors.
     */
    private int maxSumOfDivisors;

    /**
     * @param number save number which have max sum of divisors.
     */
    private int number;

    /**
     * @param N is max number.
     */
    private static final int N = 10000;

    /**
     * Magic namber for find hash code.
     *
     * @param HASH_NUMBER
     */
    private static final int HASH_NUMBER = 31;

    /**
     * Empty constructor fo class.
     */
    public Task322() {
    }

    /**
     * Find sum of denomenators.
     *
     * @param dividend
     * @return
     */
    private int findSummDenom(int dividend) {
        int sum = 0;
        for (int j = 1; j <= dividend / 2; j++) {
            if (dividend % j == 0) {
                sum += j;
            }
        }
        return sum;
    }

    /**
     * Find number, which have max sum of divisors.
     *
     * @return number, which have max sum of divisors
     */
    public int findNumberWithMaxSumOfDenominator() {

        for (int i = N / 2; i <= N; i++) {
            int tempSum = findSummDenom(i);

            if (maxSumOfDivisors < tempSum) {
                maxSumOfDivisors = tempSum;
                number = i;
            }
        }
        return number;
    }

    /**
     * Give max sum of divisors.
     *
     * @return maxSumOfDivisors.
     */
    public int getMaxSumOfDivisors() {
        return maxSumOfDivisors;
    }

    /**
     * Return number, which have a max divisors.
     *
     * @return number.
     */

    @Override
    public String solution() {
        return "The number with the maximum sum of divisors = "
                + findNumberWithMaxSumOfDenominator();
    }

    @Override
    public String getTaskNumber() {
        return "322";
    }

    @Override
    public String getTaskCondition() {
        return "Find integer from 1 to 10,000 \n"
                + "with the maximum sum of divisors.";
    }

    public int getNumber() {
        return number;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Task322 task322 = (Task322) object;

        if (maxSumOfDivisors != task322.maxSumOfDivisors) return false;
        if (number != task322.number) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maxSumOfDivisors;
        result = HASH_NUMBER * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "Task322{"
                + "maxDel=" + maxSumOfDivisors
                + ", number=" + number
                + '}';
    }
}
